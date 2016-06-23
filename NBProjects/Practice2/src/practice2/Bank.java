

package practice2;
import java.util.*;

public class Bank {

 
public static void main(String[] args) {
 Account a1 = new Account(10000);
 SavingAccount a2 = new SavingAccount(a1.getBal(),25);
 
 a2.calculateInterest();
}
}

