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
    public int maxDepth(TreeNode root) {
        int ans = helper(root,0);
        return ans;
    }
    public int helper(TreeNode root,int t){
    
        if(root!= null){
           return Math.max( helper(root.left,t+1),
            helper(root.right,t+1));
        }
        return t;
    }
}
