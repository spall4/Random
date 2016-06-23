/* Name: Pallav Shah   Title: phonedir.java
Description: The purpose of this program is to create the phone directory and
            do the concerning operations i.e. Add a new record, Change first, 
            last or phone number, show all the records, delete the record in it.
            Solution to this program would be that we create a phone directory
            with the help of LinkedList data structure. Use a record.java class
            to create different records in the directory. and with the help of 
            different methods, we can do different operations with the selected
            record. explanation of each methods is as under:
Main method: In the main method, it first asks to input the command to start 
            the phone directory program. Then it prints the menu that a user
            need to do different operations. according to the user input,
            it calls different methods and operates the directory.
addRecord(): it asks user to input details of a new record and adds it to the
            linked list.If it's the first element, it adds it to the first place
            and if there are already elements in the list, it checks if the
            last name of new record comes before any of the other records that
            already exists, and if it does, it adds it before that record and
            if it doesnt, it adds it to that last place.
remove()   : This method removes the current record from the list.
selectRecord(): This method asks user to input first name and last name and 
            checks if that record exists. if it does, it sets current record to
            that and if it doesn't, it prints that record doesn't exist.
showAll()  : This method prints all the records from the list.
menu()     : This method prints the list of commands to guide the user to
             operate the phone directory.



*/

package phonedir;
//c:\phonedir 
import java.util.LinkedList;
import java.util.Scanner;

public class Phonedir {

    public static LinkedList<record> list = new LinkedList<>();
    public static record curr = null;
    public static int count = 0, count2=0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       System.out.print("Input phone directory command: ");
        String start = in.next();
       if(start.equals("c:\\phonedir")){
        
        menu();
        System.out.print("Enter a command from the list above (q to quit):");
        String c = in.next();
        while(!c.toLowerCase().equals("q")){
        switch (c.toLowerCase()) {
            case "a": if(curr == null){
                System.out.println("No records found");
            }else{
                showAll();
            }
            break;
            case "d": if(curr == null){
                System.out.println("No records found");
            }else{
                System.out.println("Deleted: " + curr);
                curr = null;
                remove();}
                break;
            case "f":
                if(curr == null){
                    System.out.println("No Current Record");
                }else{
                System.out.print("Enter new first name: ");
                String name = in.next();
                curr.fName = name;
                System.out.println("Current record is: " + curr);
                }
              
                break;
            case "l":
                if(curr == null){
                    System.out.println("No Current Record");
             }else{
                System.out.print("Enter new last name: ");
                String lname = in.next();
                curr.lName = lname;
                list.remove(curr);
                record temp = new record(curr.fName, lname, curr.num);
if(list.isEmpty()){
    list.add(temp);
    curr = list.get(count2);
count2++;
}else{
for(int i =0; i<list.size();i++){
  
    if(temp.lName.compareTo(list.get(i).lName.toLowerCase()) <= 0){
    list.add(i,temp);
    curr = list.get(i);
    count2++; break;
    } else  {
        list.add(temp);
    curr = temp; 
count2++; break;
    }
}               System.out.println("Current record is: " + curr);}
                }
                break;
            case "n":
                addRecord();
                break;
            case "p":
                if(curr == null){
                    System.out.println("No Current Record");
                }else{
                System.out.print("Enter new phone number: ");
                String pnum = in.next();
                curr.num = pnum;
                System.out.println("Current record is: " + curr);
                }
               
                break;
                
            case "s":  if(curr == null){
                    System.out.println("No Current Record");
                }else{
                selectRecord();}
                break;
            default: System.out.println("Illegal command");
        }
        menu();
        System.out.print("Enter a command from the list above (q to quit):");
        c = in.next();
        }
    } else{
           System.out.println("Not a valid argument. Program deported!");
           System.exit(0);
       }
    }

    public static void addRecord() {  // adds a new records to the list

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String fname = input.next();
        System.out.print("Enter last name: ");
        String lname = input.next();
        System.out.print("Enter Phone number(ex 7701231524): ");
        String pnum = input.next();
        record temp = new record(fname, lname, pnum);
if(list.isEmpty()){
    list.add(temp);
    curr = list.get(count);
count++;
}else{
for(int i =0; i<list.size();i++){
    //s = list.get(i).lName.charAt(i);
    if(temp.lName.compareTo(list.get(i).lName.toLowerCase()) <= 0){
    list.add(i,temp);
    curr = list.get(i);
    count++; break;
    } else  {
        list.add(temp);
    curr = list.get(count); 
count++; break;
    }
} 
}
       


System.out.println("Current record is: " + curr);
    }
    
    public static void remove(){             // deletes the current record
        list.remove(curr);
    }

    public static void selectRecord() {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        String fname = in.next();
        System.out.print("Enter Last Name: ");
        String lName = in.next();
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).fName.equals(fname) && 
                    list.get(i).lName.equals(lName)) {
                curr = list.get(i);
               count++;
            }
        }
        if(count == 0){
            System.out.println("No matching record found.");
        }else {
        System.out.println("Current record is: " + curr);
        }
    }
   

    public static void showAll() {      // Prints all the elements from list
       System.out.println("First Name\tLast Name\tPhone number");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void menu() {  // Prints all the command
        System.out.println("\ta\tShow all records");
        System.out.println("\td\tDelete the current record");
        System.out.println("\tf\tChange the first name in the current record");
        System.out.println("\tl\tChange the last name in current record");
        System.out.println("\tn\tAdd a new record");
        System.out.println("\tp\tChange the phone number in the current "
                + "record");
        System.out.println("\tq\tQuit");
        System.out.println("\ts\tSelect a record from the record list to become"
                + " the current record");
    }

}
