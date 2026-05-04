class Solution {
    public int majorityElement(int[] nums) {
        int curE=nums[0];
        int curV=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==curE){
                curV++;
            }else{
                if(curV==0){
                    curE=nums[i];
                    curV=1;
                }else{
                    curV--;
                }
            }
        }
        return curE;
    }
}