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
// level order traversal
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null){
            return "";
        }     
        Queue<TreeNode> qu=new LinkedList<>();
        StringBuilder ans=new StringBuilder();
        qu.add(root);
        while(!qu.isEmpty()){
            int l=qu.size();
            for(int i=0;i<l;i++){
                TreeNode t=qu.poll();
                if(t!=null){
                    ans.append(t.val+",");
                    qu.offer(t.left);
                    qu.offer(t.right);
                }else{
                    ans.append("x,");
                }
            }
        }
        return ans.toString();
    }

    // Decodes your encoded data to tree.
public TreeNode deserialize(String data) {
    if (data == null || data.length() == 0) return null;

    String[] d = data.split(",");
    TreeNode root = new TreeNode(Integer.parseInt(d[0]));

    Queue<TreeNode> q = new LinkedList<>();
    q.offer(root);

    int i = 1;

    while (!q.isEmpty()) {
        TreeNode curr = q.poll();

        // left child
        if (!d[i].equals("x")) {
            curr.left = new TreeNode(Integer.parseInt(d[i]));
            q.offer(curr.left);
        }
        i++;

        // right child
        if (!d[i].equals("x")) {
            curr.right = new TreeNode(Integer.parseInt(d[i]));
            q.offer(curr.right);
        }
        i++;
    }

    return root;
}
}
