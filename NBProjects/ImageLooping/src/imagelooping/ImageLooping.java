/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagelooping;

/**
 *
 * @author YasH
 */
public class ImageLooping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         line();
      top();
      bottom();
      line();
      bottom();
      top();
      line();
    }
    public static void line() {
		System.out.println("+---------+");
	}
	
	public static void top() {
		for (int k=1; k <=4; k++) {
		System.out.print("|");
		for (int i = 1; i <= 5-k; i++) {
			System.out.print(" ");
		}
		
		for (int j = 1; j <= k-1; j++) {
			System.out.print("/");
		}
		System.out.print("*");
		for (int i = 1; i <= k-1; i++) {
			System.out.print("\\");
		}
		for (int i = 1; i <= 5-k; i++) {
			System.out.print(" ");
		}
		System.out.println("|");
	}
	}

	public static void bottom() {
		for (int k=1; k<=4; k++) {
			System.out.print("|");
			for (int i=1; i<=k; i++) {
				System.out.print(" ");
			}
			
			for (int i=1; i <= 4-k; i++) {
				System.out.print("\\");
			}
		System.out.print("*");
		
		for (int i=1; i <= 4-k; i++) {
			System.out.print("/");
		}
		for (int i=1; i <=k; i++) {
			System.out.print(" ");
		}
		System.out.println("|");
		}
	}
}


