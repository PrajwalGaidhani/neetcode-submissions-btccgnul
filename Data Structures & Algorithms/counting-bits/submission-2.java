class Solution {
    public int[] countBits(int n) {
        int[] dp=new int[n+1];
        int offset=1;
        for(int i=1;i<=n;i++){
            if(offset *2 ==i){
                offset=i;
            }
            dp[i]=1+dp[i-offset];
        }
        return dp;
    }
}
// brute force
//class Solution {
//     public int[] countBits(int n) {
//         int[] ans=new int[n+1];
//         for(int i=0;i<n+1;i++){
//             int B=i;
//             int count=0;
//             while(B>0){
//                 if( (B & 1)>0 ){
//                     count++;
//                 }
//                 B=B>>1;
//             }
//             ans[i]=count;
//         }
//         return ans;
//     }
// }

