class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int[][] visited=new int[row][col];
        int ans=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1 && visited[i][j]==0)
                ans=Math.max(ans,bfs(i,j,grid,visited));
            }
        }
        return ans;
    }
    public int bfs(int i,int j,int[][] grid,int[][] visited){
        Queue<int[]> queue=new LinkedList<>();
        int row=grid.length;
        int col=grid[0].length;
        queue.offer(new int[]{i,j});
        visited[i][j]=1;
        int area=1;
        int[][] dir={{-1,0},{1,0},{0,-1},{0,1}};
        while(!queue.isEmpty()){
            int[] t=queue.poll();
            int x=t[0];
            int y=t[1];
            for(int[] d:dir){
                int newx=x+d[0];
                int newy=y+d[1];
                if(newx>=0 && newx<row && newy>=0 && newy<col && grid[newx][newy]==1 && visited[newx][newy]==0){
                    area+=1;
                    queue.offer(new int[]{newx,newy});
                    visited[newx][newy] = 1;
                }
            }
        }
        return area;
    }
}
