
package computeavg;

import java.util.Scanner;


public class ComputeAvg {

   
    public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
   
   System.out.print("Enter an integer number: ");
   int inputNum = input.nextInt();
   double avg = computeAvg(inputNum);
   System.out.println("Average of given numbers is: " + avg);
}   
   public static double computeAvg(int x) {
       Scanner input = new Scanner(System.in);
       double sum = 0;
       int counter = 0;
       for (int i = 1; i <= x; i++) {
           System.out.print("Enter any real number: ");
           double num = input.nextDouble();
       sum = sum + num;
       counter++;
       }
       double avg = sum / counter;
   return avg;    }
    
}
