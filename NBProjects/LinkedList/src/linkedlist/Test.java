
package linkedlist;


public class Test {

    
    public static void main(String[] args) {
       Node Parent = new Node();
       Node LChild = new Node(2);
       Node RChild = new Node(7);
       
       Parent.setData(6);
       Parent.setNext(RChild);
       Parent.setPrev(LChild);
       Parent.getNext().setData(3);
       
       System.out.println("Value of Left child of the tree is : " + Parent.getPrev().getData());
       System.out.println("Value of Root of the tree is : " + Parent.getData());
       
       System.out.println("Value of Right Child of the tree is : " + Parent.getNext().getData());
       
       System.out.println();
       
    }
    
}
