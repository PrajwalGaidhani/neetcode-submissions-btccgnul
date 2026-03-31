class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> counter= new HashMap<>();
        Map<Character,Integer> counter2= new HashMap<>();
        
        for(Character c: s.toCharArray()){
            if(counter.containsKey(c)){
                counter.put(c,counter.get(c)+1);
            }else{counter.put(c,1);}
        }
         for(Character c: t.toCharArray()){
            if(counter2.containsKey(c)){
                counter2.put(c,counter2.get(c)+1);
            }else{counter2.put(c,1);}
        }
        return counter.equals(counter2);
    }
}
