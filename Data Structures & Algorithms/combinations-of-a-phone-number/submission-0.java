class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return new ArrayList<>();

        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        List<String> ans=new ArrayList<>();
        StringBuilder  temp=new StringBuilder("");
        helper(ans,temp,digits,map,0);
        return ans;
    }

    public void helper(List<String> ans,StringBuilder temp,String digits,Map<Character, String> map,int i){
        if(i==digits.length()){
            ans.add(temp.toString());
            return;
        }
       String t = map.get(digits.charAt(i)); 
        
        int l=t.length();
        for(int j=0;j<l;j++){
            temp.append(t.charAt(j));
            helper(ans,temp,digits,map,i+1);
            temp.deleteCharAt(temp.length()-1);
        }
    } 
}
