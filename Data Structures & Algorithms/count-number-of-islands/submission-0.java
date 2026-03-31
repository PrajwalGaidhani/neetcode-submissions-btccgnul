class Solution {
    public int numIslands(char[][] grid) {
        int ans=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    ans++;
                    dfs(i,j, grid);
                }
            }
        }
        return ans;
    }
    int[][] dir={{0,1},{0,-1},{1,0},{-1,0}};
    public void dfs(int i,int j, char[][] grid){
        
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != '1') {
            return;
        }
        grid[i][j]='0';
        for(int[] d:dir){
            int newi=i+d[0];
            int newj=j+d[1];
            dfs(newi,newj,grid);
        }
    }
}
