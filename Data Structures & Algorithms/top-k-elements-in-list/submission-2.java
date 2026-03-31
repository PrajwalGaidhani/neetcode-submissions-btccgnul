class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer ,Integer> Count=new HashMap<>();
        List<Integer>[] freq =new List[nums.length+1];
        for(int j=0;j<=nums.length;j++){
            freq[j]=new ArrayList<>();
        }
        for(Integer i :nums){
            Count.put(i,Count.getOrDefault(i,0)+1);
        }                                                  
        for(Map.Entry<Integer,Integer> entry :Count.entrySet()){
            freq[entry.getValue()].add(entry.getKey());

        }
        int[] res=new int[k];
        int index=0;
        for(int i=freq.length-1;i>0 && index<k ; i--){
            for(int num:freq[i]){
                res[index++]=num;
                if(index==k){
                    return res;
                }

            }
        }
        return res;
    }

}
