class Solution {
    public void islandsAndTreasure(int[][] grid) {
        Queue<int[]> q=new LinkedList<>();
        int r=grid.length;
        int c=grid[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==0){
                    q.add(new int[]{i,j});
                }
            }
        }
                if (q.size() == 0) return;

        int[][] dirs = { { -1, 0 }, { 0, -1 }, 
                         { 1, 0 }, { 0, 1 } };
        while (!q.isEmpty()) {
            int[] temp=q.poll();
            int i=temp[0];
            int j=temp[1];
            for(int[] d:dirs){
                int newi=i+d[0];
                int newj=j+d[1];
                if(newi<0 || newi>=r ||newj<0 || newj>=c || grid[newi][newj]!=Integer.MAX_VALUE ){
                    continue;
                }
                q.add(new int[]{newi,newj});
                grid[newi][newj]=grid[i][j]+1;
            }
        }
    }

}
