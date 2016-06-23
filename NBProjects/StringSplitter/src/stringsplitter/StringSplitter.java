
package stringsplitter;
import java.util.Scanner;

public class StringSplitter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.print("Enter a String and interger value respectively: ");
       String inputStr = input.nextLine();
       int inputInt = input.nextInt();
       splitter(inputStr, inputInt);
       
    }
    public static void splitter(String x , int y) {
        int length = x.length();
        int count = 0;
        String k = x;
        for (int j = length-1; j >= 0; j-- ) {
        if (length >= y) {
            for (int i = 0; i <= y-1; i ++){
     
            String chars = k.substring(i,i+1);
            System.out.print(chars);
        count++;
        }
        k = x.substring(count);
        System.out.println();
        length = k.length();
        
        
            }
        }
    }
    
}
