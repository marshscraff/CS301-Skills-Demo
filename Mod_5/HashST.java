package Mod_5;
//Implement the following methods for HashST.java (pg. 638 in your textbook):

import java.util.ArrayList;

//contains(): Returns true if this symbol table contains the specified key.
//size(): Returns the number of key-value pairs in this symbol table.
//keys(): Returns all keys in the symbol table.
public class HashST<Key,Value> {
    private int m =1024;
    private Node[] lists =new Node[m];
    private class Node{
        private Object key;
        private Object val;
        private Node next;

        public Node(Object key, Object val, Node next){
            this.key=key;
            this.val=val;
            this.next=next;
        }
    }
    public boolean contains(Key key){
        return get(key)!=null;
    }

    public int size(){
        int size=0;
        for(int i=0;i<m;i++){
        for(Node x=lists[i];x!=null;x=x.next){
           size++;
        }
        }return size;
    }

    public ArrayList<Key> keys(){
        ArrayList<Key> a= new ArrayList<Key>();
        for(int i=0;i<m;i++){
        for(Node x=lists[i];x!=null;x=x.next){
           a.add((Key)x.key);
        }
           }
        return a;
    }

    private int hash(Key key){
        return Math.abs(key.hashCode()%m);
    }

    public Value get(Key key){
        int i=hash(key);
        for(Node x=lists[i];x!=null;x=x.next)
            if (key.equals(x.key)) {
                return (Value) x.val;
            }return null;
    }
    public void put(Key key, Value val){
        int i=hash(key);
        for(Node x=lists[i];x!=null;x=x.next){
            if (key.equals(x.key)) {
                x.val=val;
                return;                
            }
        }
        lists[i]= new Node(key, val, lists[i]);
    }
}
