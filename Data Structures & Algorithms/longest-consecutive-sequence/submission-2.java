class Solution {
    public int longestConsecutive(int[] nums) {
         HashSet<Integer> set=new HashSet<>();
         for(int i:nums){
            set.add(i);
         }
         int longest=0;
         int n=nums.length;
         for(int i=0;i<n;i++){
            if(!set.contains(nums[i]-1)){
                int length=1;
                while(set.contains(nums[i]+length)){
                    length++;
                }
                longest=Math.max(longest,length);
            }
         }
         return longest;
    }
}


// class Solution {
//     public int longestConsecutive(int[] nums) {
//         Arrays.sort(nums);
//         int count_max=1;
//         int temp_max=1;
//         int n=nums.length;
//         if(n==0){
//             return 0;
//         }
//         for (int i=1;i<n;i++){
//             if(nums[i]==nums[i-1]){
//                 continue;
//             }
//             else if( nums[i]==nums[i-1]+1 ){
//                 temp_max++;
//                 }
//             else{
//                 count_max=Math.max(temp_max,count_max);
//                 temp_max=1;
//             }
            
//         }
//         count_max=Math.max(temp_max,count_max);

//         return count_max;
//         }
        
// }

