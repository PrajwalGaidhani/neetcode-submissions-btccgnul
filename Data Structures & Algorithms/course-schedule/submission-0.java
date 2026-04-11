class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // if cycle exist return false
        if(hasCycle(numCourses, prerequisites)){
            return false;
        }
        return true;
    }

    public boolean hasCycle(int numsCourses, int[][] arr){
        // calcualte in degree and out degree of each node
        // start with node with i degree of zero 
        // if all node processed then we do not have cycle 
        int[] degree=new int[numsCourses];
        ArrayList<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<numsCourses;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<arr.length;i++){
            int u=arr[i][0];  // [u ,v ] v-->u
            int v=arr[i][1];
            graph.get(v).add(u);
            degree[u]++;
        }
        Queue<Integer> qu=new LinkedList<>();
        for(int i=0;i<numsCourses;i++){
            if(degree[i]==0){
                qu.offer(i);
            }
        }
        int nodeProcessed=0;
        while(!qu.isEmpty()){
            int t=qu.poll();
            nodeProcessed++;
            for(int n:graph.get(t)){
                degree[n]--;
                if(degree[n]==0){
                    qu.offer(n);
                }
            }
            
        }
        if(nodeProcessed==numsCourses){
            return false;
        }
        return true;
    }
}
