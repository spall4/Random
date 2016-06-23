/* Name: Pallav Shah  Title: Deck 
Description: Deck is the program that creates a vector named deck containing 13 cards of hearts, 13 cards of spades,
13 cards of clubs and a3 cards of diamomds. these cards are made using the class card.java class.
Then it prints every elements of deck on the console. The vector tempDeck is an empty vector and then all
the elements of deck are copied into it. the next couple for loops are for shuffling process. the first for loops
prints any random element from the first 40 elements of the deck vector and then removes that element from the vector.
the second for loops does the same but with the remaining 12 elements. and since we have to shuffle the deck at least
20 times, the elements of tempDeck vectors are copied back into the original deck vector. and then after shuffling the deck 30 times
it prints the elements in the shuffledDeck vector.
*/


package deck;

import java.util.Vector;
import java.util.Random;

public class Deck {

    public static void main(String[] args) {
        //creates 3 different vectors capacity of 52.
        Vector<card> deck = new Vector<card>(52);
        Vector<card> shuffledDeck = new Vector<card>(52);
        Vector<card> tempDeck = new Vector<card>(52);
      //adds 13 hearts to the deck vector
        for (int i = 1; i <= 13; i++) {
            deck.add(new card(i, "Hearts"));
        }
       //adds 13 clubs to the deck vector
        for (int i = 1; i <= 13; i++) {
            deck.add(new card(i, "CLubs"));
        }
        //adds 13 spades to the deck vector
        for (int i = 1; i <= 13; i++) {
            deck.add(new card(i, "Spades"));
        }
        //adds 13 diamonds to the deck vector
        for (int i = 1; i <= 13; i++) {
            deck.add(new card(i, "Diamonds"));
        }
//copies all elements of deck into tempDeck vector
        for (int i = 0; i < deck.size(); i++) {
            tempDeck.add(deck.get(i));
        }

        System.out.println("The Sorted Deck:\n");
//Prints out the original deck
        for (int i = 0; i < 13; i++) {
            System.out.println(deck.get(i) + "\t" + deck.get(i + 13) + "\t" + deck.get(i + 26) + "\t" + deck.get(i + 39));
        }

        System.out.println("\nThe Shuffled Deck:\n");
        Random rand = new Random();
//Shuffles the deck 30 times.
        for (int j = 1; j <= 30; j++) {
           // gets any random element from 1 to 40 from deck and adds it to shuffledDeck and removes that element from the deck.
            for (int i = 1; i < 40; i++) {
                int r = rand.nextInt(10) + 1;
                shuffledDeck.add(deck.get(r));
                deck.remove(r);
            }
             // gets any remaining random element from deck and adds it to shuffledDeck and removes that element from the deck.
            for (int i = 1; i < 12; i++) {
                int r = rand.nextInt(2) + 1;
                shuffledDeck.add(deck.get(r));
                deck.remove(r);
            }
            for (int i = 0; i <= deck.size() - 1; i++) {
                shuffledDeck.add(deck.get(i));
            }
            // copies all elements from tempDeck into the deck.
            for (int i = 0; i < tempDeck.size(); i++) {
                deck.add(tempDeck.get(i));
            }
        }
// prints out all the elements of the shuffled deck.
        for (int i = 0; i < 13; i++) {
            System.out.println(shuffledDeck.get(i) + "\t" + shuffledDeck.get(i + 13) + "\t" + shuffledDeck.get(i + 26) + "\t" + shuffledDeck.get(i + 39));
        }
    }

}