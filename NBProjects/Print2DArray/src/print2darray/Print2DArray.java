// Name: Pallav Shah Date:6/17/15 Title: Print2DArray
/*Description: Asks user to enter the rows and columns of the 2D Array and saves 
  random numbers between 100-10000 in it and finds maximum and minimum out of all
  and finds out the average value. */

package print2darray;

import static java.lang.System.out;
import java.util.*;



public class Print2DArray {

   
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
     Random rand = new Random();
     out.print("Enter the number of rows: ");
     int row = in.nextInt();
     out.print("Enter the number of column: ");
     int column = in.nextInt();
     out.println();
    out.println("Pallav Shah        002-15-0347");
    out.println();
     int max = 0, min = 10000, sum = 0;
     int[][] a1 = new int[row][column];
     for(int i = 0; i < row; i++) {
         for(int j=0; j < column; j++) {
             a1[i][j] = rand.nextInt(9901)+100;
             if(max < a1[i][j]) {
                 max = a1[i][j];
             }
             if (min > a1[i][j]) {
                 min = a1[i][j];
             }
             sum += a1[i][j];
             out.printf("%8d", a1[i][j]);
         }
         out.println();
     }
     out.println();
     out.println("Maximum: "+ max + " Minimun: " + min + " Average: "+ (double)sum/(row*column));
    }
    
}
