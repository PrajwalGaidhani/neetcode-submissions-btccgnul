public class TriesNode{
    TriesNode[] children=new TriesNode[26];
    boolean endOfWord=false;
}
class PrefixTree {
    public TriesNode root;
    public PrefixTree() {
        root=new TriesNode();
    }

    public void insert(String word) {
        TriesNode curr=root;
        for(char c:word.toCharArray()){
            int i=c-'a';
            if(curr.children[i]==null){
                curr.children[i]=new TriesNode();
            }
            curr=curr.children[i];
        }
        curr.endOfWord=true;
    }

    public boolean search(String word) {
        TriesNode curr=root;
        for(char c:word.toCharArray()){
            if(curr.children[c-'a']==null){
                return false;
            }
            curr=curr.children[c-'a'];
        }
        return curr.endOfWord;
    }

    public boolean startsWith(String prefix) {
        TriesNode cur = root;
        for (char c : prefix.toCharArray()) {
            int i = c - 'a';
            if (cur.children[i] == null) {
                return false;
            }
            cur = cur.children[i];
        }
        return true;

    }
}
