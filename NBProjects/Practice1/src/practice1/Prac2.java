
package practice1;


public class Prac2 extends Prac {
   
    public Prac2 () {
    super(0,"Pallav");
    }
    
    @Override
    public int getSalary(){
        return super.getSalary() + 10000 * super.getSeniority();
    }
    @Override
    public String getColor(){
        return "Red";
    }
    
}
