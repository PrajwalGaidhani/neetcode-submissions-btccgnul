class Solution {
    public int[] countBits(int n) {
        int[] ans=new int[n+1];
        for(int i=0;i<n+1;i++){
            int B=i;
            int count=0;
            while(B>0){
                if( (B & 1)>0 ){
                    count++;
                }
                B=B>>1;
            }
            ans[i]=count;
        }
        return ans;
    }
}
