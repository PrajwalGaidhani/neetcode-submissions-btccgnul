class Solution {
    public Set<Integer> col=new HashSet<>();
    public Set<Integer> pDag=new HashSet<>();
    public Set<Integer> nDag=new HashSet<>();

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        backtrack(0,board,ans);
        return ans;
    }
    public void backtrack(int r,char[][] board,List<List<String>> ans ){
        
        if(r==board.length){
            List<String> copy=new ArrayList<>();
            for(char[] row: board){
                copy.add(new String(row));
            
            }
            ans.add(copy);
         return ;   
        }
        for(int c=0;c<board.length;c++){
            if(isSafe(r,c)){
            board[r][c]='Q';
            col.add(c);
            pDag.add(r+c);
            nDag.add(r-c);
            backtrack(r+1,board,ans);
            board[r][c]='.';
            col.remove(c);
            pDag.remove(r+c);
            nDag.remove(r-c);
            }
        }

    }
    public boolean isSafe(int r,int c){
        if(col.contains(c)){
            return false;
        }
        if(pDag.contains(r+c)){
            return false;
        }
        if(nDag.contains(r-c)){
            return false;
        }
        return true;
    }
}
