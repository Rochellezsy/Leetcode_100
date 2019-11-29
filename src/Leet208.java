/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */

public class Leet208 {
    private TrieNode root;

    /** Initialize your data structure here. */
    public Leet208() {
        root=new TrieNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode node=root;
        for(int i=0;i<word.length();i++){
            char cur=word.charAt(i);
            if(!node.containsKey(cur)){
                node.put(cur,new TrieNode());
            }
            node=node.get(cur);
        }
        node.setEnd();
    }

    public TrieNode searchPrefix(String word){
        TrieNode node=root;
        for(int i=0;i<word.length();i++){
            char cur=word.charAt(i);
            if(node.containsKey(cur)){
                node=node.get(cur);
            }
            else {
                return null;
            }
        }
        return node;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode node=searchPrefix(word);
        return node!=null && node.isEnd();
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode node=searchPrefix(prefix);
        return node!=null;
    }
}
