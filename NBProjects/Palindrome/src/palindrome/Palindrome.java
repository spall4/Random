
package palindrome;

import java.util.*;
public class Palindrome {

    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    printPalidrome(input);
    }
    public static void printPalidrome(Scanner input){
        String original , reverse = "";
    System.out.print("Enter any sentence to check if it is palindrome or not: ");
    original = input.nextLine();
    int l = original.length();
    for ( int i = l-1; i >= 0; i--) {
        reverse += original.charAt(i);
    }
     if ( original.equals(reverse)) {
         System.out.println("Given sentence is palindrome.");
     } else {
         System.out.println("Given sentence is not palindrome.");
     }
    }
    
}
