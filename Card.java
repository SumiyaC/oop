/*package oop;
	// Fig. 7.9: Card.java
	// Card class represents a playing card.

	public class Card {
	   private final String face; // face of card ("Ace", "Deuce", ...)
	   private final String suit; // suit of card ("Hearts", "Diamonds", ...)

	   // two-argument constructor initializes card's face and suit
	   public Card(String cardFace, String cardSuit) {
	      this.face = cardFace; // initialize face of card
	      this.suit = cardSuit; // initialize suit of card
	   } 

	   // return String representation of Card
	   public String toString() {             
	      return face + " of " + suit;        
	   }  
	   public int compareTo(Card otherCard) {
		    if (this.face.getValue() < otherCard.face.getValue()) {
		        return -1;
		    } else if (this.face.getValue() > otherCard.face.getValue()) {
		        return 1;
		    } else {
		        return 0;
		    }
		}

	} */
package oop;

public class Card {
	private final Rank rank;
    private final String suit;
	
    public enum Rank {
        ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7),
        EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13);

        private int value;

        private Rank(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
    public Card(Rank cardRank, String cardSuit) {
        this.rank = cardRank;
        this.suit = cardSuit;
    }

    public Rank getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    public String toString() {
        return rank + " of " + suit;
    }

    public int compareTo(Card otherCard) {
        if (this.rank.getValue() < otherCard.rank.getValue()) {
            return -1;
        } else if (this.rank.getValue() > otherCard.rank.getValue()) {
            return 1;
        } else {
            return 0;
        }
    }
}



