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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return dfs(root,subRoot);
    }
    public boolean dfs(TreeNode root, TreeNode subRoot){
        if(root!=null && subRoot!=null && root.val==subRoot.val && isSameTree(root,subRoot)){
            return true;
        }
        if(root!=null){
            return dfs(root.left,subRoot) || dfs(root.right,subRoot);
        }
        return false;
    }

        public boolean isSameTree(TreeNode p, TreeNode q) {
        if(q==null && p==null){
            return true;
        }
        if( p==null || q==null ||p.val!=q.val ){
            return false;
        }

        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);

    }
}
