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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root == null ) return ans;
        // ans.add(new ArrayList<Integer>() {{ add(root.val); }});
        Queue<TreeNode> qu=new LinkedList<>();
        qu.add(root);
      while(!qu.isEmpty()){
        int l=qu.size();
        List<Integer> t=new ArrayList<>();
        for(int i=0;i<l;i++){
            TreeNode t1=qu.poll();
            t.add(t1.val);
            if(t1.left!=null) qu.add(t1.left);
            if(t1.right!=null) qu.add(t1.right);
        }        
        ans.add(t);
      }
      return ans;
    }
}
