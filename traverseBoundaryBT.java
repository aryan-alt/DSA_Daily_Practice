/************************************************************

    Following is the Binary Tree node structure:
    
   class TreeNode {
	    int data;
	    TreeNode left;
	    TreeNode right;

	    TreeNode(int data) {
		    this.data = data;
		    this.left = null;
		    this.right = null;
	    }

    }

************************************************************/

import java.util.ArrayList;

public class Solution {
	 static Boolean isLeaf(TreeNode node) {
        return (node.left == null) && (node.right == null);
    }
   static void addLeftBoundary(TreeNode node, ArrayList<Integer> res){
    	TreeNode curr = node.left;
        while( curr != null){
            if(isLeaf(curr) == false)res.add(curr.data);
            if(curr.left != null)curr = curr.left;
            else curr = curr.right;
        }
    }
    
      static void addRightBoundary(TreeNode node, ArrayList<Integer> res){
    	TreeNode curr = node.right;
        ArrayList<Integer> temp = new ArrayList<Integer>();
            
        while( curr != null){
            if(isLeaf(curr) == false)temp.add(curr.data);
            if(curr.right != null)curr = curr.right;
            else curr = curr.left;
        }
            for(int i = temp.size()-1; i >= 0; --i){
                res.add(temp.get(i));
            }
    }
    
    static void addLeaf(TreeNode node, ArrayList<Integer> res){
        if (isLeaf(node)) {
            res.add(node.data);
            return;
        }
        if (node.left != null) addLeaf(node.left, res);
        if (node.right != null) addLeaf(node.right, res);
    }
    
    public static ArrayList<Integer> traverseBoundary(TreeNode root){
		// Write your code here.
        ArrayList<Integer> ans = new ArrayList<Integer>();
        if(isLeaf(root) == false)ans.add(root.data);
        addLeftBoundary(root, ans);
        addLeaf(root, ans);
        addRightBoundary(root, ans);
        return ans;
	}
}