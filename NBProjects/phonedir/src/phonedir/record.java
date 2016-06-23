/*Name: Pallav Shah Name:record.java
Description: This class is a blueprint for the phonedir.java class. It has three
            data fields to save first name, last name and phone number. Class 
            has one constructor that accepts three parameters and sets those 
            values to the fields. This class has getters and setters that 
            gets and sets the values of and to the data fields. and a 
            toString method to return the value.
*/
package phonedir;


public class record {
   public String fName,lName, num;
     
    //Constructor
    public record(String FName,String LName,String num){
        this.fName = FName;
        this.lName = LName;
        this.num = num;
        }
   //Setters
     public void setFName(String fname){
        this.fName = fname;
    }
    public void setLName(String lname){
        this.lName = lname;
    }
    public void setPNum(String pnum){
        this.num = pnum;
    }
    //Getters
    public String getFName(){
        return fName;
    }
    public String getLName(){
        return lName;
    }
    
    public String toString(){
       return fName+"\t\t"+lName+"\t\t"+num.substring(0, 3)+"-"+num.substring
        (3, 6)+
               "-"+num.substring(6, num.length());
   }
   
}
