/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxwithwidth_height;

import java.util.Scanner;

/**
 *
 * @author YasH
 */
public class BoxWithWidth_Height {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
    System.out.print("Please enter width : ");
    int width = keyboard.nextInt();
    System.out.print("Please enter height : ");
    int height = keyboard.nextInt();
    
    box(height, width);
}
    public static void box(int height, int width) {
        System.out.print("*");
        for (int i = 1; i <= width - 2; i++) {
            System.out.print("-");
        }
        System.out.println("*");
        
        for(int j=1; j<= height-2; j++) {
            System.out.print("|");
            for (int k=1; k <= width-2; k++) {
                System.out.print(" ");
           
            }
            System.out.println("|");
        }
        System.out.print("*");
        for (int i = 1; i <= width - 2; i++) {
            System.out.print("-");
        }
        System.out.println("*");
    }
    }
    

