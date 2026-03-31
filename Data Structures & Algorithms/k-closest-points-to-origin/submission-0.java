class Solution {
    public int[][] kClosest(int[][] points, int k) {
        // if(k>)
        PriorityQueue<int[]> queue=new PriorityQueue<>(Comparator.comparingInt(a->((a[0]*a[0]+a[1]*a[1]))));
        for(int i=0;i<points.length;i++){
            queue.offer(points[i]);
        }
        int[][] ans=new int[k][2];
        for(int i=0;i<k;i++){
            int[] a=queue.poll();
            ans[i][0]=a[0];
            ans[i][1]=a[1];
        }
        return ans;
    }
}
