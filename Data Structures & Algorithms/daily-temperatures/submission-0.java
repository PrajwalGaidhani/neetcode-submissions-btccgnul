class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> stack=new Stack<>();
        int[] ans=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            int t=temperatures[i];
            while(!stack.isEmpty() && t>stack.peek()[0]){
                int[] temp=stack.pop();
                ans[temp[1]]=i-temp[1];
            }
            stack.push(new int[]{t,i});
        }
        return ans;
    }
}
