
package bank;

import java.io.*;
import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Bank
{
    private static Object choice;
    public static void main(String[] args)
   {
      
       Scanner sn = new Scanner(System.in);
       String runAgain = "yes";
       while(runAgain.equalsIgnoreCase("yes"))
       {
           // REad user choice
           /*System.out.println("Would you like to run the bank simulation? Enter \"yes\" or \"no\": ");
           String choice = sn.nextLine();
           choice.toLowerCase();*/

           /*
           if (choice.equals("yes") || choice.equals("y"))
           { */ 
        // Method to run the code continuously to simulate bank
       
      // {
      
           // Declare the required varaibles
       /* Random bankrand = new Random();
       Queue<Integer> bankqueue = new LinkedList<Integer>();
       boolean bankteller1,bankteller2,bankteller3,bankteller4,bankteller5 = false;
       boolean[] banktellersArray = {bankteller1, bankteller2, bankteller3, bankteller4, bankteller5};
       int[] banktellersArray2 = {(bankrand.nextInt(5 - 2) + 2),(bankrand.nextInt(5 - 2) + 2),(bankrand.nextInt(5 - 2) + 2),(bankrand.nextInt(5 - 2) + 2),(bankrand.nextInt(5 - 2) + 2)};
       int bi = 0;
       int ba1, bb1, bc1, bd1, be1;
       int custServed1, custServed2, custServed3, custServed4, custServed5 = 0;
       int occuTime1, occuTime2, occuTime3, occuTime4, occuTime5 = 0;
       int bv, bw, bx, by, bz = 1;*/
       // Method to run the code:
           Runnable bankRunnable = new Runnable() {

                @Override
                public void run() {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            };
           ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
       executor.scheduleAtFixedRate(bankRunnable, 0, 1, TimeUnit.SECONDS);
       run();
       System.out.print("Do you wanna run the program again? : " );
       runAgain = sn.next();
       }
       System.exit(0);
   }
        public static void run()
        {
            
             Random bankrand = new Random();
           Queue<Integer> bankqueue = new LinkedList();
           boolean bankteller1 = false,bankteller2 = false,bankteller3 = false,bankteller4 = false,bankteller5 = false;
           boolean[] banktellersArray = {bankteller1, bankteller2, bankteller3, bankteller4, bankteller5};
           int[] banktellersArray2 = {(bankrand.nextInt(5 - 2) + 2),(bankrand.nextInt(5 - 2) + 2),(bankrand.nextInt(5 - 2) + 2),(bankrand.nextInt(5 - 2) + 2),(bankrand.nextInt(5 - 2) + 2)};
           int bi = 0;
           int ba1 = 0, bb1 = 0, bc1 = 0, bd1 = 0, be1 = 0;
           int custServed1 = 0, custServed2 = 0, custServed3 = 0, custServed4 = 0, custServed5 = 0;
           int occuTime1 = 0, occuTime2 = 0, occuTime3 = 0, occuTime4 = 0, occuTime5 = 0;
           int bv = 1, bw = 1, bx = 1, by = 1, bz = 1;
               // Code to check time is reached to two minutes
                  if(bi == 120)
                  {
                      //checks if 120 seconds (2 minutes) are up then prints output
                      System.out.println("The amount of customers that visited the bank was: " + (custServed1 + custServed2+ custServed3
                      + custServed4 + custServed5 + 5 + bankqueue.size()) + " customers.");
                      System.out.println("The amount of customers that each teller helped was: ");
                       //numerous outpues as requested by assignment
                      System.out.println("Teller 1: " + (custServed1 + 1));
                      System.out.println("Teller 2: " + (custServed2 + 1));
                      System.out.println("Teller 3: " + (custServed3 + 1));
                      System.out.println("Teller 4: " + (custServed4 + 1));
                      System.out.println("Teller 5: " + (custServed5 + 1));
                      System.out.println("For ba1 total of " + (custServed1 + custServed2 + custServed3
                      + custServed4 + custServed5 + 5) + " customers.");
                      System.out.println("The amount of time the tellers were occupied was: " + (occuTime1 + occuTime2 + occuTime3
                      + occuTime4 + occuTime5) + " seconds.");
                      System.out.println("The amount of customers that didn't get to see ba1 teller was : " + bankqueue.size() + " customers");
                      System.out.println("Ending simulation...");
                      System.exit(0);
                  }
                  // Time is below two minutes then add customers randomly between 2-6 seconds into queue
                  else
                  {
                   if(bankrand.nextInt(4) < 6)
                   {
                       int btime = (bankrand.nextInt(5-2)+3);
                       bankqueue.add(btime);

                   }
                   // Code to check each teller done service to customer
                   while(bv == 1)
                   {   
                       ba1 = bi;
                       bv = 0;
                   }
                   // Code to checks the passed time greater then or equal to random processing number for customer
                   if ((bi - ba1) >= banktellersArray2[0])
                   {
                       banktellersArray[0] = true;
                       //Code to set the teller to new customer in queue and increments customersServed or occupiedtime
                       if (banktellersArray[0] == true && bankqueue.isEmpty() == false)
                       {
                           occuTime1 += banktellersArray2[0];
                           banktellersArray2[0] = bankqueue.poll();
                           bv = 1;
                           custServed1++;
                       }
                   }
                   // Code to check each teller done service to customer
                   while(bw == 1)
                   {
                       bb1 = bi;
                       bw = 0;
                   }
                   // Code to checks the passed time greater then or equal to random processing number for customer
                   if ((bi - bb1) >= banktellersArray2[1])
                   {
                       banktellersArray[1] = true;
                       if (banktellersArray[1] == true && bankqueue.isEmpty() == false)
                       {
                           occuTime2 += banktellersArray2[1];
                           banktellersArray2[1] = bankqueue.poll();
                           bw = 1;
                           custServed2++;
                       }
                   }
                   // Code to checks the passed time greater then or equal to random processing number for customer
                   while(bx == 1)
                   {
                       bc1 = bi;
                       bx = 0;
                   }
                   // Code to checks the passed time greater then or equal to random processing number for customer
                   if ((bi - bc1) >= banktellersArray2[2])
                   {
                       banktellersArray[2] = true;
                       if (banktellersArray[2] == true && bankqueue.isEmpty() == false)
                       {
                           occuTime3 += banktellersArray2[2];
                           banktellersArray2[2] = bankqueue.poll();
                           bx = 1;
                           custServed3++;
                       }
                   }
                   // Code to checks the passed time greater then or equal to random processing number for customer
                   while(by == 1)
                   {
                       bd1 = bi;
                       by = 0;
                   }
                   // Code to checks the passed time greater then or equal to random processing number for customer
                   if ((bi - bd1) >= banktellersArray2[3])
                   {
                       banktellersArray[3] = true;
                       if (banktellersArray[3] == true && bankqueue.isEmpty() == false)
                       {
                           occuTime4 += banktellersArray2[3];
                           banktellersArray2[3] = bankqueue.poll();
                           by = 1;
                           custServed4++;
                       }
                   }  
                  
                   // Code to checks the passed time greater then or equal to random processing number for customer
                   while(bz == 1)
                   {
                       be1 = bi;
                       bz = 0;
                   }
                   // Code to checks the passed time greater then or equal to random processing number for customer
                   if ((bi - be1) >= banktellersArray2[4])
                   {
                       banktellersArray[4] = true;
                       if (banktellersArray[4] == true && bankqueue.isEmpty() == false)
                       {
                           occuTime5 += banktellersArray2[4];
                           banktellersArray2[4] = bankqueue.poll();
                           bz = 1;
                           custServed5++;
                       }
                   }
                   bi++;
                   if(bankqueue.size() == 1)
                   {
                       System.out.println("There is " + bankqueue.size() + " person currently in the queue."); //each second, prints how many people are in the bankqueue
                   }
                   else
                   {
                       System.out.println("There are " + bankqueue.size() + " people currently in the queue.");
                   }
                   System.out.println("There are " + (120 - bi) + " seconds left in the simulation."); //also prints how many seconds left in simulation
                   System.out.println("--------");
               }
           }
       //};
       

   // }
   // Code to validate invalid input
       /*else if (choice.equals("no") || choice.equals("n"))
       {
       
       System.out.println("Ending program...");
       System.exit(0);
       }
       else
       {
       System.out.println("Incorrect input. Enter \"yes\" or \"no\": "); //check that input was correct
       }*/
       
    }

