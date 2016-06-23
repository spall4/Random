
package mystack;
import java.util.*;

public class MyStack {
//Stack s = new Stack();
        Vector<Object> v = new Vector();
    static   ArrayList<Integer> stack = new ArrayList();
  
    public static void main(String[] args) {
        
        
        
    }
    
    public void push(int o){
    stack.add(o);
    }
    public static void pop(){
        stack.remove(stack.size()-1);
    }
    public static int peek(){
       int p = stack.get(stack.size()-1);
        return p; 
    }
    
    public static boolean isFull(){
     return true;
    }
    
    
}
