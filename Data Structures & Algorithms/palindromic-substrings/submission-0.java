class Solution {
    public int helper(String s, int l, int r){
        int count=0;
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                count++;
                l--;
                r++;
        }
        return count;
    }
    public int countSubstrings(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            ans+=helper(s,i,i);
            ans+=helper(s,i,i+1);
        }
        return ans;
    }
}


// M1 : genenrate all possible sub string and check if each onne of them are palindrone if yes incremnnt the count
// M2 : 