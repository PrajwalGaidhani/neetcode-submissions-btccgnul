class Solution {
     public int uniquePaths(int m, int n) {
        int[][] dp=new int[n][m];
                for (int[] row : dp) {
            Arrays.fill(row, -1); // Initialize all cells to -1
        }
        return helper(m-1,n-1,dp);
     }
    public int helper(int m, int n, int[][] dp) {
        if(n==0||m==0){return 1;}
        if(dp[n][m]!=-1){return dp[n][m];}
        dp[n][m]= helper(m,n-1,dp) +helper(m-1,n,dp);
        return dp[n][m];
    }
}
// Recursion not optomal
// class Solution {
//      public int uniquePaths(int m, int n) {
//         return helper(m-1,n-1);
//      }
//     public int helper(int m, int n) {
//         if(n==0||m==0){return 1;}
//         return helper(m,n-1) +helper(m-1,n);
//     }
// }
