// Name: Pallav Shah Date:6/17/15 Title: IncomeTax
/*Description: Ask any random number of people till 15 for their taxable 
 income and displays the tax due then finds out the maximum tax value out of all. */
package incometax;

import java.util.*;

public class IncomeTax {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        double income;

        double max = 0;
        for (int i = 1; i <= rand.nextInt(15) + 1; i++) {
            System.out.print("Enter the amount of taxable income: ");
            income = in.nextDouble();
            double tax = incomeTax(income);
            if (max < tax) {
                max = tax;
            }
        }
        System.out.println("Max tax value is: " + max);
    }

    public static double incomeTax(double income) {
        double tax, rest;
        if (income < 750) {
            tax = income * 0.01;

        } else if (income < 2500) {
            rest = income - 750;
            tax = 7.5 + rest * 0.02;
        } else if (income < 5000) {
            rest = income - 2500;
            tax = 82.5 + rest * 0.04;
        } else if (income <= 8000) {
            rest = income - 5000;
            tax = 142.5 + rest * 0.05;
        } else {
            rest = income - 8000;
            tax = 230.0 + rest * 0.06;
        }
        System.out.println("The tax due is: " + tax);
        return tax;
    }

}
