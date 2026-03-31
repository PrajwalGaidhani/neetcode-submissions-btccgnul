class Solution {
    public Map<Character ,Integer> count(String s){
        Map<Character,Integer> Count=new HashMap<>();
        for(Character c:s.toCharArray()){
            Count.put(c,Count.getOrDefault(c,0)+1);
        }
        return Count;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<Map<Character,Integer> , List<String>> Dict= new HashMap<>();
        for(String s : strs){
            Map<Character,Integer> count1=count(s);
            if(Dict.containsKey(count1)){
                Dict.get(count1).add(s);
            }else{
                List<String> list=new ArrayList<>();
                list.add(s);
                Dict.put(count1,list);
            }
        
        }
        List<List<String>> ans=new ArrayList<>();
        for(List<String> list: Dict.values()){
            ans.add(list);

        }
        return ans;
    }
}
