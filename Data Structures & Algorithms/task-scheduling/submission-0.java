class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] cout=new int[26];
        for(Character task: tasks){
            cout[task-'A']++;
        }
        // we dont care about taks now we just care about fequ we just need total least time to complete all taks
        PriorityQueue<Integer> MaxHeap=new PriorityQueue<>(Collections.reverseOrder());
        for(int cnt:cout){
            if(cnt>0){
            MaxHeap.offer(cnt);                
            }
        }
        int time=0;
        Queue<int[]> q=new LinkedList<>();
        while(!MaxHeap.isEmpty() || !q.isEmpty()){
            time++;
            if(MaxHeap.isEmpty()){
                time=q.peek()[1];
            }else{
                int cnt=MaxHeap.poll()-1;
                if(cnt>0){
                    q.add(new int []{cnt,time+n});
                }
            }
            if(!q.isEmpty() && q.peek()[1]==time){
                MaxHeap.add(q.poll()[0]);
            }
        }
        return time;
    }
}
