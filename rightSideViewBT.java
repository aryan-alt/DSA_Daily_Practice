/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
         List<Integer> ans = new ArrayList<Integer>();
         rview(root, ans, 0);
         return ans;
    }
    
    public void rview(TreeNode nod, List<Integer> res, int lvl){
        if(nod == null){
            return;
        }
        
        if(lvl == res.size()){
            res.add(nod.val);
        }
        
       rview(nod.right, res, lvl+1);
       rview(nod.left, res, lvl+1);
    }
}