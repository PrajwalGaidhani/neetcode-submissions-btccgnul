// class Solution {
//     public boolean search(int[] nums, int t) {
//         int l=0;
//         int r=nums.length-1;
//         while(l<=r){
//             int m=l+(r-l)/2;
//             if(t==nums[m]){
//                 return true;
//             }
//             if(nums[l]<nums[m]){
//                 if(nums[l] <= t && t < nums[m]){
                 
//                     r=m-1;
//                 }else{
                    
//                     l=m+1;
//                 }
//             }else if(nums[m]<nums[l]){
//                 if(t>nums[m] && t<=nums[r]){

//                     l=m+1;
//                 }else{
//                     r=m-1;
//                 }
//             }
//         }
//         return false;
//     }
// }
class Solution {
    public boolean search(int[] nums, int t) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int m = l + (r - l) / 2;

            if (nums[m] == t) return true;

            // Case 1: duplicates block decision
            if (nums[l] == nums[m] && nums[m] == nums[r]) {
                l++;
                r--;
            }
            // Case 2: left half sorted
            else if (nums[l] <= nums[m]) {
                if (nums[l] <= t && t < nums[m]) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            }
            // Case 3: right half sorted
            else {
                if (nums[m] < t && t <= nums[r]) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }
        }
        return false;
    }
}