// class Solution {
//     public List<List<Integer>> pacificAtlantic(int[][] heights) {
        
//     }
// }

class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        Queue<int[]> pacQueue=new LinkedList<>();
        Queue<int[]> atlQueue=new LinkedList<>();
        int r=heights.length;
        int c=heights[0].length;
        int[][] pac=new int[r][c];
        int[][] atl=new int[r][c];
        for(int i=0;i<r;i++){
            pacQueue.add(new int[]{i,0});
            atlQueue.add(new int[]{i,c-1});
        }
        for(int j=0;j<c;j++){
                pacQueue.add(new int[]{0,j});
                atlQueue.add(new int[]{r-1,j});
            
            }
        bfs(heights,pac,pacQueue);
        bfs(heights,atl,atlQueue);
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(pac[i][j]==1 && atl[i][j]==1){
                    ans.add(Arrays.asList(i, j));
                }
            }
        }

        return ans;
    }
    public int[][] dir={{0,-1},{0,1},{1,0},{-1,0}};
    public void bfs(int[][] heights,int[][] markwater,Queue<int[]> q){
            while(!q.isEmpty()){
                int[] temp=q.poll();
                int r=temp[0];
                int c=temp[1];
                if(markwater[r][c]==1) continue;
                markwater[r][c]=1;
                for(int[] d:dir){
                    int nr=r+d[0];
                    int nc=c+d[1];
                    if(nr<0 || nr >=heights.length 
                    || nc<0 || nc>= heights[0].length 
                    || heights[r][c]>heights[nr][nc] 
                    || markwater[nr][nc] == 1 ){
                        continue;
                    }
                    q.add(new int[]{nr,nc});
                    
                    
                }
            }
    }
    
}