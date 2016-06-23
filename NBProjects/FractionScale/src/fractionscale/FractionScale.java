// Name: Pallav Shah  Date: 7/9/15  Title: FractionScale
// Description : This programs the scaling operations on a fraction.    

package fractionscale;

import java.util.*;

public class FractionScale {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a fraction: ");
        String s = in.nextLine();
        int n = s.indexOf("/");
        String s1 = s.substring(0, n).trim();
        String s2 = s.substring(n + 1).trim();
        int num = Integer.parseInt(s1);
        int denom = Integer.parseInt(s2);

        Fraction f1 = new Fraction(num, denom);
        System.out.print("Scale up or down(1: up, 0: down) :  ");
        int i = in.nextInt();
        while (i != 1 && i != 0) {
            System.out.println("Entered number is not 0 or 1. Try again!");
            System.out.print("Scale up or down(1: up, 0: down) :  ");
            i = in.nextInt();
        }
System.out.print("Enter a scale factor: ");
int scale = in.nextInt();
f1.scale(scale, i == 1);
System.out.println("Scaled fracton is : " + f1.getNumerator() + "/" + f1.getDeominator());
    }
}
