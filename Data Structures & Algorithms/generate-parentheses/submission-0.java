class Solution {
    public void helper(List<String> ans, int o,int c, int n,String temp){
        if(o>n) return;
        if(c>n) return;
        if(o+c==2*n){
            ans.add(temp);
            return;
        }
        if(o<=c){
            temp+="(";
            helper(ans,o+1,c,n,temp);
        }else{
            helper(ans,o+1,c,n,temp+"(");
            helper(ans,o,c+1,n,temp+")");
            
        }
    }
    public List<String> generateParenthesis(int n) {
        int o=0;
        int c=0;
        List<String> ans=new ArrayList<>();
        helper(ans,o,c,n,"");
        return ans;

    }
}
