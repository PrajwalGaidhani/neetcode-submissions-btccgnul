class Solution {
    public void helper(int[] nums,ArrayList<Integer> temp, List<List<Integer>> ans,int i) {
        if(i==nums.length){
            ans.add(new ArrayList<>(temp)); // Add a copy of temp
            return;
        }
        temp.add(nums[i]);
        helper(nums,temp,ans,i+1);
        temp.remove(temp.size() - 1);
        helper(nums,temp,ans,i+1);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(nums,new ArrayList<>(),ans,0);
        return ans;
    }
}
