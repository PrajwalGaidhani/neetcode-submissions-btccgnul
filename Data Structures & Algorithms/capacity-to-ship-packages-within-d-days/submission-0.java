class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int i=weights[0];
        int k=i;
        for(int j:weights){
            i=Math.max(i,j);
            k+=j;    
        }
        int ans=0;
        while(i<=k){
            int m=i+(k-i)/2;
            if(canDo(weights,days,m)){
                ans=m;
                k=m-1;
            }else{
                i=m+1;
            }
        }
        return ans;
    }
    public boolean  canDo(int[] weights, int days, int capacity){
        int currdays=1;
        int currW=0;
        for(int w:weights){
            if(currW+w>capacity){
                currdays+=1;
                currW=0;
            }
            currW+=w;
        }   
        return currdays<=days;
    }
}   