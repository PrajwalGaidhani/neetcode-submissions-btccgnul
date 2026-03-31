class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> stackB=new Stack<>();
        Stack<Integer> stackS=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='('){
                stackB.add(i);
            }else if(c=='*'){
                stackS.add(i);
            }else{
                if(!stackB.isEmpty()){
                    stackB.pop();
                }else if(!stackS.isEmpty()){
                    stackS.pop();
                }else{
                    return false;
                }
            }
        }
             // Match remaining '(' with later '*'
        while (!stackB.isEmpty() && !stackS.isEmpty()) {
            if (stackB.pop() > stackS.pop()) {
                return false;
            }
        }
        
        return stackB.isEmpty();
    }
}
