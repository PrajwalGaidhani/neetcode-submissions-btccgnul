//merge sort
class Solution {
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        if(n<=1){return nums;}
        int m=nums.length/2;
        int[] a= sortArray(Arrays.copyOfRange(nums,0,m));
        int[] b= sortArray(Arrays.copyOfRange(nums,m,n));
        int[] c=merger(a,b);
        return c;
    }
 public int[] merger(int[] a, int[] b) {
    int[] c = new int[a.length + b.length];

    int i = 0, j = 0, k = 0;

    while (i < a.length && j < b.length) {
        if (a[i] < b[j]) {
            c[k++] = a[i++];
        } else {
            c[k++] = b[j++];
        }
    }

    while (i < a.length) {
        c[k++] = a[i++];
    }

    while (j < b.length) {
        c[k++] = b[j++];
    }

    return c;
}
}