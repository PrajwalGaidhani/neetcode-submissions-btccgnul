class Solution {
    public int[] findOrder(int n, int[][] pre) {
        // in this we want to return a valid order to do things
        // in previous we we detecting cyle
        // but in topological sort increment counter of procssed node 
        // if we just sore then then that is what we need
        int[] degree=new int[n];
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<pre.length;i++){
            int u=pre[i][0]; // v--->u
            int v=pre[i][1];
            degree[u]++;
            graph.get(v).add(u);
        }
        Queue<Integer> qu=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(degree[i]==0){
                qu.offer(i);
            }
        }
        int count=0;
        int[] ans=new int[n];
        while(!qu.isEmpty()){
            int t=qu.poll();
            ans[count]=t;
            count++;
            for(int ng :graph.get(t)){
                degree[ng]--;
                if(degree[ng]==0){
                    qu.offer(ng);
                }
            }
        }
        if(count==n){
            return ans;
        }
        return new int[0];
    }
}
