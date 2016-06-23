
package arraylistsort;
import java.util.*;

public class ArraylistSort {

    public static void main(String[] args) {
     ArrayList<Integer> list = new ArrayList<Integer> (); 
    Random rand = new Random();
      
    for (int j = 0; j < 50 ; j++){
    int k = rand.nextInt(40) + 1;
    list.add(k);
    //sort(k,list);
    }
    // to print the list
    System.out.print("Unsorted list : ");
    for(int i = 0; i < list.size(); i++) {
        System.out.print(list.get(i) + " ");
    }
   System.out.println();
   sort(list);
   System.out.print("Sorted List : ");
   for(int i = 0; i < list.size(); i++) {
        System.out.print(list.get(i) + " ");
    }
   
    }
    public static void sort(ArrayList<Integer> list) {
       
       for( int  i = 0; i <= list.size() -2; i ++ ){
          // int j = i+1;
            int x = list.get(i), y = list.get(i+1);
            if(x > y) {
                list.add(i,y);
                list.remove(y);
            }
            
       }
           
       
    }
    }
