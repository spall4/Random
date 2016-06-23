
package monotoniousseries;
import java.util.*;

public class MonotoniousSeries {

    
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
       
        a.add(1);
        a.add(2);
        a.add(10); 
        a.add(11); 
        a.add(4);
        //a.add(12);
        a.add(5);
        a.add(8);
        a.add(6);
        a.add(7);
        checkSeries(a);
        
    }
 public static void checkSeries(ArrayList<Integer> a) {
     
     for(int i=0;i<a.size()-1;i++){
         if(a.get(i) > a.get(i+1)){
             a.remove(i);
             while(a.get(i-1) > a.get(i)){
                 a.remove(i-1);
             }
         }
     }
     
     System.out.print("Monotonious Series is : " );
     for(int i =0;i<a.size();i++){
         System.out.print(a.get(i) + "\t");
     }
 }  
}
