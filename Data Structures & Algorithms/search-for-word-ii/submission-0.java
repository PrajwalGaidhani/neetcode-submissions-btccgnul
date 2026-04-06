class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        List<String> ans =new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(exist(board,words[i])){
                ans.add(words[i]);
            }
        }
        return ans;
    }
    public boolean exist(char[][] board, String word) {
        int r=board.length;
        int c=board[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(board[i][j]==word.charAt(0)){
                    if(helper(board,i,j,0,word)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean helper(char[][] board, int i, int j,int k,String word ){
        if(k==word.length()){return true;}
        if(i<0 || j<0 || i> board.length-1 || j>board[0].length-1  || board[i][j]=='1' ){return false;}
        if(board[i][j]==word.charAt(k)){
            char temp=board[i][j];
            board[i][j]='1';
            //mark visited
            boolean ans= helper(board,i+1,j,k+1,word) || helper(board,i,j+1,k+1,word) || helper(board,i-1,j,k+1,word) || helper(board,i,j-1,k+1,word) ; 
            board[i][j]=temp;
            return ans;
        }
        return false;
    }
}
