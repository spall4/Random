//Name: Pallav Shah Date: 6/16/15 Title: Christmas Tree
//Description: asks user to input the number of segments and height and prints a christmas tree accordingly.
package christree;

import java.util.Scanner;


public class ChrisTree {

   
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        System.out.print("Enter number of segments: ");
        int seg = in.nextInt();
        System.out.print("Enter the height: ");
        int height = in.nextInt();    
        drawTree(seg, height);
    }
    public static void drawTree(int seg, int height) {
         for (int l = 0; l < seg; l++) {

            for (int i = l; i < height + l; i++) {
                for (int j = 1; j <= height * seg - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2 * i + 1; k++) {
                    System.out.print("*");
                }

                System.out.println();
            }

        }
        for (int j = 1; j <= 3; j++) {
            for (int i = 1; i < height * seg + 1; i++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for(int i = 1; i <= height * seg - 3; i++) {
            System.out.print(" ");
        }
        for(int i = 1; i <= 7; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
