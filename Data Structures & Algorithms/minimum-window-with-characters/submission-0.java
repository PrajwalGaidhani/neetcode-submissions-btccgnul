class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> mapt=new HashMap<>();
        HashMap<Character, Integer> maps=new HashMap<>();

        for(char c:t.toCharArray()){
            mapt.put(c,mapt.getOrDefault(c,0)+1);
        }
        int tTotal=mapt.size();
        int n=s.length();
        int minLen=Integer.MAX_VALUE;
        int l=0;
        int sTotal=0;
        int start=0;
        for(int r=0;r<n;r++){
            char t1=s.charAt(r);
            if(tTotal!=sTotal){
            if(mapt.containsKey(t1)){
                maps.put(t1,maps.getOrDefault(t1,0)+1);
                if(maps.get(t1)==mapt.get(t1)){
                    sTotal++;
                }
             } 
            }
                
                while(tTotal==sTotal ){
                    if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    start = l;
                }

                    char t2=s.charAt(l);
                    if(maps.containsKey(t2)){
                        maps.put(t2,maps.get(t2)-1);
                        if(maps.get(t2)<mapt.get(t2)){
                        sTotal--;
                        }
                    }
                    l++;
                }
            
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}


// M1. generate all possible substring and for each substring find if t is present in current substring store it and find the smallest one
// M2.  create a hashmap of t , slide a window if current substring does nothing to toal count of then we incremnt i counter else inreement j counter 