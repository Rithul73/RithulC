package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card.
 * To be used as starting code in Exercise
 *
 * Modified by Rithul Chandran on 24/01/2024
 * @author Rithul Chandran
  
 */
public class CardTrick {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            int value = random.nextInt(13) + 1; // Random value between 1 and 13
            String suit = Card.SUITS[random.nextInt(Card.SUITS.length)]; // Random suit
            hand[i] = new Card();
            hand[i].setValue(value);
            hand[i].setSuit(suit);
            // Uncomment the following line for debugging purposes to see the generated cards
            System.out.println(hand[i].getValue() + " of " + hand[i].getSuit());
        }

        // Asking the user for card value and suit
        System.out.println("Enter card value (1-13, where 11=Jack, 12=Queen, 13=King): ");
        int userValue = scanner.nextInt();
        System.out.println("Enter suit (1=Hearts, 2=Diamonds, 3=Spades, 4=Clubs): ");
        int suitIndex = scanner.nextInt() - 1;
        String userSuit = Card.SUITS[suitIndex];

        // Search for the card
        boolean found = false;
        for (Card card : hand) {
            if (card.getValue() == userValue && card.getSuit().equals(userSuit)) {
                found = true;
                break;
            }
        }

        if (found) {
            printInfo();
        } else {
            System.out.println("Sorry, your card was not found in the hand.");
        }

        scanner.close();
    }
    //I'm Done!
    private static void printInfo() {
    System.out.println("Congratulations, you guessed right!");
    System.out.println();
    
    System.out.println("My name is Rithul Chandran");
    System.out.println();
    
    System.out.println("My career ambitions is to become a Software Engineer at Google");
    System.out.println();  

    System.out.println("My hobbies includes: ");
    System.out.println("Football. Playing football is my number one hobby.");
    System.out.println("Otherthan playing football I spent my free time to watch webseries.");
    System.out.println();
}

    }

