class Solution {
    public boolean hasDuplicate(int[] nums) {
            Set<Integer> myset= new HashSet<>();
            for(int i=0;i<nums.length;i++){
                if(myset.contains(nums[i])){
                    return true;
                }
                myset.add(nums[i]);
            }
            return false;
    }
}
