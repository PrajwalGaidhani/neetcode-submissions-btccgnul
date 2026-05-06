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
    int ans=0;
    public int sumNumbers(TreeNode root) {
        int t=0;
        helper(root,t);
        return ans;
    }
    public void helper(TreeNode root, int t){
        if(root==null) return;
        t=(t*10)+root.val;
        if(root.left==null && root.right==null){
            ans+=t;
            return;
        }
        helper(root.left,t);
        helper(root.right,t);
    
    }
}