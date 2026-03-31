class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
            if (Arrays.stream(gas).sum() < Arrays.stream(cost).sum()) {
            return -1;
        }
        // one solution exits
        int n=gas.length;
        int curG=0;
        int start=0;
        for(int i=0;i<n;i++){
            curG += gas[i] - cost[i];
            if(curG<0){
                start=i+1;
                curG=0;
            }
        }
        return start;
    }
}
