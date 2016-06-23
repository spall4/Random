/* Name: Pallav Shah  Title: Arraylist.java
 Description: This class helps to create arraylist objects and use different methods to 
 make better use of it. There are two constructors to create objects 
 and 8 instance methods to manipulate the arraylist.
We're using Arrays to do this assignment.

It declares two fields. one is an Object 
First constructor Arraylist() creates an object with default capacity of 10.
Second constructor Arraylist(int n) accepts a parameter n and creates an Arraylist object
and sets the capacity of n to it.
Method add(object x) accepts x as a parameter. It creates a temporary array with one more 
        capacity than arr array. it copies all the elements from arr to temp. and then adds x into
        the last place of temp. At the end, temp directs to arr.
Method add(int index, Object x) does the similar thing. It creates a temp array. Copies elements from arr
        to temp until the index and then adds x into temp in the index and copies the rest of elements 
        from arr to temp. At the end, temp directs to arr.
Method get(int index) accepts an index number and returns the value at that index from arr.
Method size() returns the number of non-null empty elements. It compares all the elements in arr with 
        null and if it's different than null, the number increases.
Method isEmpty() checks if the Arraylist is empty or not. It counts the number of elements in the
        Arraylist and if it is equal to 0, it returns true and if not, it returns false.
Method isIn(Object x) checks if the Object x is in the Arraylist or not. If it is, it returns true and
        if not, it returns false.
Method find(Object x) finds the object x in the Arraylist and returns the index of the object. it it
        doesn't find that object, it returns -1.
Method remove(Object x) removes the Object x from the Arraylist. It first creates a temp array with 
        one less capacity than arr and copies the elements until that object from arr to temp. 
        It skips that object and copies all the other elements into temp from arr. 
        At the end, temp directs to arr.  
Method toString() returns all the elements the the Arraylist object.

*/
package testarray;

import java.util.Arrays;

public class Arraylist {

    private int capacity;
    private Object[] arr;

    //Constructors
    public Arraylist() {              // Creates an array with the default size of 10
        capacity = 10;
        arr = new Object[capacity];

    }

    public Arraylist(int n) {        // Creates an array with the input size
        arr = new Object[n];
    }

    //Instance methods
    public void add(Object x) {              // Adds an object in the last place
        Object[] temp = new Object[arr.length + 1];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        temp[temp.length - 1] = x;
        arr = temp;
    }

    public void add(int index, Object x) {               //Adds an object at the desired index
        Object[] temp = new Object[arr.length + 1];
        // temp =  Arrays.copyOfRange(arr, 0, index);
        System.arraycopy(arr, 0, temp, 0, index);
        temp[index] = x;
        for (int i = index + 1; i < temp.length; i++) {
            temp[i] = arr[i - 1];
        }
        arr = temp;
    }

    public Object get(int index) {               // Gets an object at a given index
        return arr[index];
    }

    public int size() {              // Calculates the number of non-empty objects in the array
        int count = 0;
        for (Object arr1 : arr) {
            if (!(arr1 == null)) {
                count++;
            }
        }
        return count;
    }

    public boolean isEmpty() {               //Checks if the array is empty
        int count = 0;
        for (Object arr1 : arr) {
            if (!(arr1 == null)) {
                count++;
            }
        }
        return count == 0;
    }

    public boolean isIn(Object x) {              // Checks for an object in the array
        int i = 0;
        while (i < arr.length) {
            if (arr[i].equals(x)) {
                return true;
            }
            i++;
        }
        return false;
    }

    public int find(Object x) {                  // Finds an object and returns the index of that
        int i = 0;
        while (i < arr.length) {
            if (arr[i].equals(x)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public void remove(Object x) {              // Removes an object from an array
        Object[] temp = new Object[arr.length - 1];
        System.arraycopy(arr, 0, temp, 0, find(x));
        for (int i = find(x); i < temp.length; i++) {
            temp[i] = arr[i + 1];
        }
        arr = temp;
    }

    public String toString() {              // Prints an array
        return Arrays.toString(arr);
    }
}
