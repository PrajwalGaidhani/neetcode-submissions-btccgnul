class Solution {
    public int sum(List<Integer> t){
        int s=0;
        for(int i: t){
            s+=i;
        }
        return s;
    }
    public void helper(List<List<Integer>> ans,List<Integer> temp,int[] nums,int target,int i,int n){
        int s=sum(temp);
        if(i==n ||s>target ){
            return;
        }
        if(s==target){
            ans.add(new ArrayList(temp));
            return;
        }
        temp.add(nums[i]);
        helper(ans,temp,nums,target,i,n);
        temp.remove(temp.size()-1);
        helper(ans,temp,nums,target,i+1,n);
        
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        int l=nums.length;
        List<List<Integer>> ans=new ArrayList<>();
        helper(ans,new ArrayList<Integer>(),nums, target,0,l);
        return ans;
    }
}
