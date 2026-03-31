/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node dfs(Node node, HashMap<Node,Node> oldNewMap){
        if(node==null) return null;
        if(oldNewMap.containsKey(node)){
            return oldNewMap.get(node);
        }
        Node copy=new Node(node.val);
        oldNewMap.put(node,copy);
        List<Node> CopyNeig=new ArrayList<>();
        for(Node n:node.neighbors){
            CopyNeig.add(dfs(n,oldNewMap));
        }
        copy.neighbors=CopyNeig;
        return copy;
    }
    public Node cloneGraph(Node node) {
        HashMap<Node,Node> oldNewMap=new HashMap<>();
        return dfs(node,oldNewMap);
    }
}