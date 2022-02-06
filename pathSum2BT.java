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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        findPath(root, targetSum, new ArrayList<Integer>(), ans);
        
        return ans;
    }
    
    static void findPath(TreeNode node, int sum, List<Integer> curr, List<List<Integer>> path){
        if(node == null){
            return;
        }
        
        curr.add(node.val);
        if(node.val == sum && node.left == null && node.right == null){
            path.add(curr);
            return;
        }
        
        findPath(node.left, sum - node.val, new ArrayList<Integer>(curr), path);
        findPath(node.right, sum - node.val, new ArrayList<Integer>(curr), path);
    }
}