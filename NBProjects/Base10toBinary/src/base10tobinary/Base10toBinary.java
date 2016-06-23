
package base10tobinary;


import java.util.Scanner;
public class Base10toBinary {

   
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter any positive integer : ");
   int n = keyboard.nextInt();
   int whatsLeft;
   String number = "";
   for (int i=1; n>0; i++){
   whatsLeft = n%2;
   n /= 2;
   number += whatsLeft;
   }
   
   //System.out.println(number);

   int digits = number.length();
   System.out.print(number.substring(digits));
   for (int j = digits; j > 0 ; j--) {
       System.out.print(number.substring(j-1, j));
   }
   System.out.println();
    }
    
}
