class Solution {
     public int uniquePaths(int m, int n) {
        return helper(m-1,n-1);
     }
    public int helper(int m, int n) {
        if(n==0||m==0){return 1;}
        return helper(m,n-1) +helper(m-1,n);
    }
}
