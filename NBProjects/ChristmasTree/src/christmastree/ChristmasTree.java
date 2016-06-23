/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package christmastree;

/**
 *
 * @author YasH
 */
import java.util.Scanner;
public class ChristmasTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  Scanner keyboard = new Scanner(System.in);
  System.out.print("Enter Value: ");
  int n = keyboard.nextInt();
        for (int i = 0; i <= n-1; i++) {
      for (int j = 1; j <= n-i; j++) {
          System.out.print(" ");
      }
      for (int j = 1; j <= 2*i + 1; j++) {
       System.out.print("*");
   }
      for(int j = 1; j <= n-i; j++ ) {
          System.out.print(" ");
      }
      System.out.println();
      }
    }
    
}
