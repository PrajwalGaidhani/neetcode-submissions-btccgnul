class Solution {
    public int maxArea(int[] h) {
        int n=h.length;
        int max_area=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int l=j-i;
                int b=Math.min(h[i],h[j]);
                int area=l*b;
                max_area=Math.max(area,max_area);
            }
        }
        return max_area;
        
        
    }
}
