class Solution {
    public int trap(int[] h) {
        int n=h.length;
        int l=0;
        int r=n-1;
        int ans=0;
        int lmax=0;
        int rmax=0;
        while(l<r){
            lmax=Math.max(lmax,h[l]);
            rmax=Math.max(rmax,h[r]);
            if(lmax<rmax){
                ans+=lmax-h[l++];
            }else{
                ans+=rmax-h[r--];
            }

        }
        return ans;
    }
    
}
