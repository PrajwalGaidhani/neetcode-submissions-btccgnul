class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=piles[0];
        int min=1;
        int n=piles.length;
        for(int i=0;i<n;i++){
            max=Math.max(max,piles[i]);
        }
        int ans=0;
        while(min<=max){
            int mid=min+(max-min)/2;
            int temp=helper(mid,piles);
            if(temp<=h){
                ans=mid;
                max=mid-1;
            }else{
            min=mid+1;
        }

        }
        return ans;
    }

    public int helper(int mid, int[] piles){
        int ans=0;
        for(int p:piles){
            ans+=Math.ceil((double) p/mid);
        }
        return ans;
    }
}
