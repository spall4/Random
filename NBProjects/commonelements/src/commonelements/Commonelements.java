/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commonelements;

import java.util.Arrays;

/**
 *
 * @author YasH
 */
public class Commonelements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a = {1,2,3,5,9,6};
        int[] b = {2,5,3};
        findCommon(a,b);
        //Arrays.toString(b);
    }
    public static void findCommon(int[] a, int[] b){
    int [] x;
        if(a.length > b.length){
        x = new int[a.length];
    }else {
            x = new int[b.length];
        }
        int k = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < b.length;j++){
                if(a[i] == b[j]){
                 x[k] = a[i];
                 k++;
                   // System.out.print(a[i] + " ");
                    
                }
            }
        }
        System.out.println(Arrays.toString(x));
        /* for(int i = 0; i < x.length; i++){
        if(x[i] != 0){
        System.out.print(x[i] + " ");
        }}*/
    }
    
  
}
