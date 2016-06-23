
package practice1;

public class Prac {
  
    private int years;
    private String name;
   
    public Prac(int years, String name){
    this.years = years;
    this.name = name;
    }
    
    public int getYears(){
        return years;
    }
    public String employeeName(){
      return "Pallav";
  }
  
  public int getSalary(){
      return 100000;
  }
  
  public String getColor(){
      return "Yellow";
  }
  
  public int getDaysOff(){
      return 30 + years * 2;
  }

    public int getSeniority(){
        return 2*years;
    }
}
