/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice2;


public class SavingAccount extends Account {
    private double rate;
    public SavingAccount(double bal, int rate){
        super(bal);
        this.rate = rate;
    }
    
    public void calculateInterest(){
        System.out.println("Interest earned in 1 year for $"+ super.getBal() +" is :"
        + (super.getBal()* rate)/100);
    }
}
