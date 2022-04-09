package Lab4;

import java.util.*;

public class Card

    {
        private int suit;  // Initializes two variables for the card
        private int value;

public Card()  // constructor of the card that creates a random suit and value for the card

    {       
     Random num = new Random();
     suit = num.nextInt(4);
     value = num.nextInt(13)+1;
    }

        public Card(int Card_suit, int Card_value)  // constructor of the card that takes an int representing suit and value
            {
                suit = Card_suit;
                value = Card_value;
            }

            public int getValue()  // returns the numeric value of the card   

                {
                    return value;
                }

                public int getSuit()  // returns the numeric coded value of the card' suit

                    {
                        return suit;
                    }



   public String getSuitAsString()  // Return a String representing the card's suit.
                                    // (If the card's suit is invalid, "??" is returned.)
   {

    switch ( suit )
      {
        case 3: return "Spades";

        case 2: return "Hearts";

        case 1: return "Diamonds";

        case 0: return "Clubs";

        default: return "??";
      }

   }


        public String getValueAsString()  // Return a String representing the card's value.
                                          // If the card's value i// Compares the value of the card, to the value, as an int, of another card
                                          // returns true if value > other card, false if not invalid, "??" is returned.
        {
            switch ( value )
            {
                case 1: return "Ace";

                case 2: return "2";

                case 3: return "3";

                case 4: return "4";

                case 5: return "5";

                case 6: return "6";

                case 7: return "7";

                case 8: return "8";

                case 9: return "9";

                case 10: return "10";

                case 11: return "Jack";

                case 12: return "Queen";

                case 13: return "King";

                default: return "??";
            }

        }

        public String toString()  // overrides toString method,
        {
            return getValueAsString() + " of " + getSuitAsString(); // Return a String representation of this card, such as
                                                                    // "10 of Hearts" or "Queen of Spades".
        }


        public boolean compareValue(int cardOther)
        {
        	return value > cardOther;
        }
        
        public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
	        Card cd = new Card();
	        System.out.println(cd.toString());
	        System.out.println(cd.compareValue(cd.getValue()));
	        System.out.println();
	        }
        }


            }