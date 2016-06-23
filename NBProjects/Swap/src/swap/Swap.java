// Name: Pallav Shah Date: 6/16/15 Title: Swap letters and digits
// Description: It gets input from the user as string and numbers and swaps letters of the string and digits of the entered number 
package swap;

import java.util.*;
import static java.lang.System.out;

public class Swap {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        out.print("Please input a string to be swapped: ");

        String line = in.nextLine();
        String newLine = swapLetterPairs(line);
       //
        out.print(newLine);
        out.println();

        out.print("Please input a number to be swapped: ");
        int digit = in.nextInt();
        out.println(swapDigitPairs(digit));

    }

    public static String swapDigitPairs(int n) {
        String s = "" + n;
        String end = "";
        if (s.length() % 2 == 0) {
            for (int i = 0; i < s.length(); i += 2) {
                end += s.charAt(i + 1) + "" + s.charAt(i);
            }
            return end;
        } else {
            end += s.charAt(0);
            for (int i = 1; i < s.length(); i += 2) {
                end += s.charAt(i + 1) + "" + s.charAt(i);
            }
            return end;

        }
    }

    public static String swapLetterPairs(String s) {

        String end = "";
        if (s.length() % 2 == 0) {
            for (int i = 0; i < s.length(); i += 2) {
                end += s.charAt(i + 1) + "" + s.charAt(i);
            }
            return end;
        } else {
            end += s.charAt(0);
            for (int i = 1; i < s.length(); i += 2) {
                end += s.charAt(i + 1) + "" + s.charAt(i);
            }
            return end;

        }
    }

}
