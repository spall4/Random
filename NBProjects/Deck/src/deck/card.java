
// Name: Pallav Shah  Title: Card.java
/*Description: This class helps to make a card in deck class. it has a constructor  that accepts a value of the card 
and a name of the suits. and then toString method checks for the value and reassigns new value and returns the final
string.
*/
package deck;


public class card {
   private String suit;
   private int value;
    public card(int value,String suit){
        this.suit = suit;
        this.value = value;
    }
    
    public String toString(){
        String newVal = "";
        switch (value) {
            case 1: newVal = "Ace";
                break;
            case 2: newVal = "king";
                break;
            case 3: newVal = "queen";
                break;
            case 4: newVal = "Jack";
                break;
            case 5: newVal = "10";
                break;
            case 6: newVal = "9";
                break;
            case 7: newVal = "8";
                break;
            case 8: newVal = "7";
                break;
            case 9: newVal = "6";
                break;
            case 10: newVal = "5";
                break;
            case 11: newVal = "4";
                break;
            case 12: newVal = "3";
                break;
            case 13: newVal = "2";
                break;
            default: newVal += value;
        }
        
        return newVal + " of " + suit;
    }
}
