class Solution {
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        int[] temp=new int[n];
        mergerSort(nums, temp,0,n-1);
        return nums;
    }
    public void mergerSort(int[] nums,int[] temp, int l, int r){
          if(l>=r) return;
        int m=l+(r-l)/2;
        mergerSort(nums,temp,l,m);
        mergerSort(nums,temp,m+1,r);
        merger(nums,temp,l,m,r);
    }
    public void merger(int[] nums,int[] temp, int l , int m, int r){
        int i=l;
        int j=m+1;
        int k=l;
        while(i<=m && j<=r){
            if(nums[i]<=nums[j]){
                temp[k++]=nums[i++];
            }else{
                temp[k++]=nums[j++];
            }
        }
        while(i<=m){
            temp[k++]=nums[i++];
        }
        while(j<=r){
            temp[k++]=nums[j++];
        }
        for( i=l;i<=r;i++){
            nums[i]=temp[i];
        }
    }

}