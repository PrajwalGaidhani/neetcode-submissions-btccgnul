class Solution {
        public HashMap<String,Integer> map;
    public int change(int amount, int[] coins) {
        map=new HashMap<>();
        return helper(amount, coins ,0 ,0);
    }
    public int helper(int amount, int[] coins, int i, int currSum){
        if(i>=coins.length || currSum>amount){
            return 0;
            }
        if(currSum==amount){return 1;}
        String key=i+""+currSum;
        if(map.containsKey(key)){return map.get(key);}
        int ans=helper(amount,coins,i+1,currSum) + helper(amount,coins,i,currSum+coins[i]);
        map.put(key,ans);
        return ans;


    }
}
