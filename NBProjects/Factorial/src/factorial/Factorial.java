/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;


public class Factorial {

    
    public static void main(String[] args) {
        int n =35;
        double multiple = 1.0;
        for (int i =0; i <= n-1; i++) {
            multiple = multiple * (n-i);
        }
    System.out.println(multiple);
    }
    
}
