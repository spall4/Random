//Name: Pallav Shah  
package csc2310;


public class Student {
   private String name;
   private double test1, test2, test3;
  
   // constructors
   
   public Student(String name){
       this.name = name;
       test1 = 0.0; test2 = 0.0; test3 = 0.0;
   }
  
  public Student(){
      test1 = 0.0; test2 = 0.0; test3 = 0.0;
   } 
   //Instace Methods
   
   public void setName(String name){
       this.name = name;
   }
   
   public String getName(){
       return name;
   }
   
   public void setTest(double t[]){
       test1 = t[0];
       test2 = t[1];
       test3 = t[2];
   }
   
   public char getLetterGrade(){
       double g = (test1+test2+test3)/3;
       if(g >= 60) return 'S';
       else  return 'F';
   }
   
   public double getBestScore(){
       double max = 0.0;
       
       if(max < test1) max = test1;
       if(max < test2) max = test2;
       if(max < test3) max = test3;
       
       return max;
   }
}
