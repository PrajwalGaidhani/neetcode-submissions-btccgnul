class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        dp[0][0]=dfs(0,0,m-1,n-1,dp);
        return dp[0][0];
    }
    public int dfs(int i, int j, int m, int n,int[][] dp){
        if(i==m && j==n){
            return 1;
        }
        if(i>m || j>n){return 0;}
        if(dp[i][j]!=0){return dp[i][j];}
        dp[i][j]=dfs(i+1,j,m,n,dp)+dfs(i,j+1,m,n,dp);
        return dp[i][j];
    }
}



// class Solution {
//     public int uniquePaths(int m, int n) {
//     int[] row=new int[n];
//     Arrays.fill(row,1);
//     for(int i=0;i<m-1;i++){
//         int[] newRow=new int[n];
//         Arrays.fill(newRow,1);
//         for(int j=n-2;j>=0;j--){
//             newRow[j]=newRow[j+1]+row[j];
//         }
//         row=newRow;
//     }    
//     return row[0];
//     }
// }
// // class Solution {
// //      public int uniquePaths(int m, int n) {
// //         int[][] dp=new int[n][m];
// //         for (int[] row : dp) {
// //             Arrays.fill(row, -1); // Initialize all cells to -1
// //         }
// //         return helper(m-1,n-1,dp);
// //      }
// //      //for first  row or col ther is only one way to reach 0,0 . 
// //     public int helper(int m, int n, int[][] dp) {
// //         if(n==0||m==0){return 1;} 
// //         if(dp[n][m]!=-1){return dp[n][m];}
// //         dp[n][m]= helper(m,n-1,dp) +helper(m-1,n,dp);
// //         return dp[n][m];
// //     }
// // }
// // Recursion not optomal
// // class Solution {
// //      public int uniquePaths(int m, int n) {
// //         return helper(m-1,n-1);
// //      }
// //     public int helper(int m, int n) {
// //         if(n==0||m==0){return 1;}
// //         return helper(m,n-1) +helper(m-1,n);
// //     }
// // }
