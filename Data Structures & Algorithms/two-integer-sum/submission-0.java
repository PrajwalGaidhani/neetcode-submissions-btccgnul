class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mymap=new HashMap<>();
        /*map store index and value*/
        for(int i=0;i<nums.length;i++){
            int x=target-nums[i];
            if(mymap.containsKey(x)){
                int[] y={ mymap.get(x),i};
                return y;
            }else{
                mymap.put(nums[i],i);
            }
        }
        return nums;
    }
}
