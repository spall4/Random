/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lexisnexis;
import java.util.ArrayList;

/**
 *
 * @author YasH
 */


public class LexisNexis {

    public static void main(String[] args) {
    int Sum=0, i=0, j=0;
    for(i=0;i<=1000;i++)
        if (i%3==0 || i %5 == 0)
            Sum=Sum+i;
   
    System.out.println("The Sum is "+Sum);
}
}
