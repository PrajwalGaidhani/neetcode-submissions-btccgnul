class Solution {
    public int splitArray(int[] nums, int k) {
        int l=nums[0];
        int r=0;
        for(int i:nums){
            l=Math.max(i,l);
            r=r+i;
        }
        int ans=Integer.MAX_VALUE;
        while(l<=r){
            int m=l+(r-l+1)/2;
            if(helper(nums,k,m)){
                r=m-1;
                ans=Math.min(ans,m);
            }else{
                l=m+1;
            }
        }
        return ans;
    }
    public boolean helper(int[] nums , int k , int m){
            int requiredUser=1;
            int sum=0;
            for(int i:nums){
                sum+=i;
                if(sum>m){
                    requiredUser++;
                    sum=i;
                }
            }
            if(requiredUser<=k){
                return true;
            }
            return false;
    }
}