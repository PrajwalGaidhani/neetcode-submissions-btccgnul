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
    public int global;
    public int maxPathSum(TreeNode root) {
        if(root==null){ return 0;}
        global=root.val;
         helper(root);
         return global;
    }
    public int helper(TreeNode r){
        if(r!=null){
            int lm=Math.max(helper(r.left),0);
            int rm=Math.max(helper(r.right),0);
            // value if we do r+l+r;
            int t=r.val+lm+rm;
            global=Math.max(global,t);
            // select l or r
            return r.val +Math.max(lm,Math.max(rm,0));
            
        }
        return 0;
    }
}
