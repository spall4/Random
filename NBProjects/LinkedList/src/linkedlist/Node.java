
package linkedlist;


public class Node {
    int data;
    Node next,prev;
    
    public Node(){}
    public Node(int value){
        this.prev = null;
        this.data = value;
        this.next = null;
        }
    //Setters
    public void setData(int newVal){
        this.data = newVal;
    }
    
    public void setNext(Node next){
        this.next = next;
    }
    
    public void setPrev(Node prev){
        this.prev = prev;
    }
    //Getters
    public int getData(){
        return data;
    }
    
    public Node getNext(){
        return next;
    }
    
    public Node getPrev(){
        return prev;
    }
    
    public void setNext(int val){
        Node temp = new Node();
        temp.data = val;
        this.next = temp;
    }
    public void setPrev(int val){
        Node temp = new Node();
        temp.data = val;
        this.prev = temp;
    }
}
