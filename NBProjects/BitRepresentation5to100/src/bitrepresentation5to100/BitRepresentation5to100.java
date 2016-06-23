
package bitrepresentation5to100;


public class BitRepresentation5to100 {

    
    public static void main(String[] args) {
        
         for (int i = 5; i <= 100; i += 5) {
        System.out.println("bit pattern representation of " + i + " is " + binary(i) + ".");
        }
       
    }
    public static String binary(int n){
        int whatsLeft;
        String number = "";
        for (int i = 1; n >0 ; i++) {
            whatsLeft = n % 2;
            n /= 2;
            number += whatsLeft;
        }
        int length = number.length();
        String binary = "";
        for (int j = length; j >= 1; j--) {
            binary += number.substring(j-1, j);
        }
    return binary;
    }
    
}
