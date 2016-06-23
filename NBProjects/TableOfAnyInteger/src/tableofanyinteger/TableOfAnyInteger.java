/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableofanyinteger;

import java.util.Scanner;


public class TableOfAnyInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        int y;
        System.out.print ("Write the value : ");
        y = keyboard.nextInt();
        firstLine(y);
        line(y);
        bottom(y);
    }
    public static void line (int x) {
		for (int i=1; i <= 8 * (x +1); i++) {
			System.out.print("-");
		}
		System.out.println();
	}
	
	public static void firstLine(int x) {
		System.out.print("*\t|\t");
		for (int i =1; i <= x; i++) {
			System.out.print(i + "\t" );
		}
		System.out.println();
	}
	
	public static void bottom(int x) {
	
		for (int k = 1; k <= 10; k++) {
			System.out.print(k + "\t|\t");
			for (int i=1; i <= x; i++) {
				System.out.print(k * i + "\t");
				
			}
			System.out.println();
		}
	}
    
}
