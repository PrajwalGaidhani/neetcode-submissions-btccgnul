// recursion 
class Solution {
    public int maxProfit(int[] p) {
        return helper(0,p,0,0,0);
        
    }

    public int helper(int i, int[] p, int currSum,int maxSum,int canSell){
        if(currSum>maxSum){
            maxSum=currSum;
        }
        if(i>=p.length){
            return maxSum;
        }
        if(canSell==0){
        return Math.max(helper(i+1,p,currSum-p[i],maxSum,1),
        helper(i+1,p,currSum,maxSum,0));
        }else{
        return    Math.max(helper(i+2,p,currSum+p[i],maxSum,0),
            helper(i+1,p,currSum,maxSum,1));
        }
    }
}
