/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbermadeupof;

import java.util.Scanner;


public class NumberMadeUpOf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
   System.out.print("Please enter a number : ");
   int n = keyboard.nextInt();
   int X = counter(n);
   System.out.println(n + " has " + X + " digits" );
   System.out.println("and is the sum of the following numbers!");
     
   
   for(int i = X-1; i >= 0; i--) {
        
       int whatsLeft = (int)(n % Math.pow(10,i));
       n = (int)(n/ Math.pow(10,i));
       System.out.println( n + " * " + Math.pow(10, i) + " = " + n * Math.pow(10, i));
       n = whatsLeft;
      }
    }
     public static int counter(int x) {
    int count = 0;
    
    for (int i = 1; x >0; i++) {
        x /= 10;
        count++;
    }
    return count;
    }

    
}
