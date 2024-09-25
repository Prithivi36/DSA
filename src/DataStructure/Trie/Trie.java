package DataStructure.Trie;

public class Trie {
    class Node{
        char  c;
        Node[] child = new Node[26];
        int count=0;
        public Node(char c){
            this.c=c;
        }
    }
    Node root = new Node(' ');

    public void insert(String s){
        char[] arr=s.toCharArray();
        Node temp=root;
        for(char c : arr){
            int index=c-'a';
            if(temp.child[index]==null) temp.child[index]=new Node(c);
            temp.child[index].count++;
            temp=temp.child[index];
        }
    }
    public int calcCount(String s){
        char[] arr=s.toCharArray();
        Node temp =root;
        int ans=0;
        for(char c : arr){
            int index=c-'a';
            Node node= temp.child[index];
            ans+=node.count;
            temp=node;
        }
        return ans;
    }
}
