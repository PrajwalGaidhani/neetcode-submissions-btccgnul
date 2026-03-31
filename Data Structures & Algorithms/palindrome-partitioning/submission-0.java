class Solution {
    public boolean ispal(String s, int i, int j){
        String t=s.substring(i,j+1);
        String r=new StringBuilder(t).reverse().toString();
        return t.equals(r);
    }
    public void helper(List<List<String>> ans,List<String> temp,String s,int i,int n){
        if(i==n){
            ans.add(new ArrayList<>(temp));
            return ;
        }
        for(int j=i;j<n;j++){
            if(ispal(s,i,j)){
                temp.add(s.substring(i,j+1));
                helper(ans,temp,s,j+1,n);
                temp.remove(temp.size()-1);
            }
            
        }
    } 
    public List<List<String>> partition(String s) {
            List<List<String>> ans=new ArrayList<>();
            List<String> temp=new ArrayList<>();
            helper(ans, temp,s,0,s.length());
            return ans;
    }
}


// only way
// brute force generate all possible partion and check if string is palindron and add to ans arra
