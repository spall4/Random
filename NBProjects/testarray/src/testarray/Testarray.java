/* Name: Pallav Shah  Title: testarray.java 
Description: The is a test program that tests all the constructors and the instance methods 
created in the Arraylist class.
This program creates two Arraylist objects one with parameter and the one without 
parameter. It adds the elements in these arrays and checks if those adding methods work
successfully or not. Then checks all the other methods with return type if those work or not too.
and in the end, it checks if it removes an element from the Arraylist with remove method.

*/

package testarray;

public class Testarray {

    public static void main(String[] args) {
        Arraylist a1 = new Arraylist(0);
        System.out.println("Arraylist 1 successfully created with initial size of 0.");
        Arraylist a2 = new Arraylist();
        System.out.println("Arraylist 2 successfully created with default size of 10.");

        for (int i = 3; i <= 4; i++) {
            a1.add(i);
        }
        a1.add(5);
        
        System.out.println("Different values successfully added in the arraylist 1.");
        a1.add(1, 9);
        System.out.println("Arraylist 1 is : " + a1.toString());
        a2.add(3, "Four");
        System.out.println("Arraylist 2 is : " + a2.toString());
        System.out.println("Value \"Four\" successfully added in the arraylist 2 at index 3.");
        System.out.println("Value at index 3 in the Arraylist 1 is : " + a1.get(3));
        System.out.println("The size of Arraylist 1 is : " + a1.size());
        System.out.println("Is the Arraylist 1 is empty? - " + a1.isEmpty());
        System.out.println("Does the Arraylist 1 contain value 8? - " + a1.isIn(8));
        System.out.println("What is the index of value 3 in Arraylist 1? : " + a1.find(3));
        a1.remove(9);
        System.out.println("Value 9 successfully removed from the arraylist 1.");
        System.out.println(" Updated Arraylist 1 is : " + a1.toString());

    }

}
