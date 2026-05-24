class Solution {
    public boolean validTree(int n, int[][] edges) {
        // no cycle
        // connected

        // Tree must have exactly n-1 edges
        if (edges.length != n - 1) {
            return false;
        }
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] u : edges){
            graph.get(u[0]).add(u[1]);
            graph.get(u[1]).add(u[0]);
        }
        int[] visited=new int[n];
        if(dfsHasCycle(0,-1,graph,visited)){
            return false;
        }
        for(int i:visited){
            if(i==0){
                return false;
            }
        }

        return true;
    }
    public boolean dfsHasCycle(int i, int parent,List<List<Integer>> graph,int[] visited ){
        visited[i]=1;
        for(int neg: graph.get(i)){
            if(visited[neg]==0){
                if(dfsHasCycle(neg,i,graph, visited)){
                    return true;
                }
                else if(neg==parent){
                    return true;
                }
            }
            }
 
        return false;
    }
}
