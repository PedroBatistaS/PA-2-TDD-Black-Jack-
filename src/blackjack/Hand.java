package blackjack;

import java.util.*;
import blackjack.Card.*;
import static blackjack.Card.*;

public class Hand {
    
    private List<Card> hand;
    private int score;
    public static int BLACKJACK = 21; 

    public Hand() {
        this.hand = new LinkedList<Card>();
        this.score = 0;
    }

    public int getScore() {
        return score;
    }
    
    public boolean isBust() {
        return this.score > BLACKJACK;
    }
    
    public boolean isBlackjack() {
        return this.score == BLACKJACK && isBlackJack();
    }

    public List<Card> getHand() {
        return hand;
    }
    
    public void add(Card ...cards) {
        hand.addAll(Arrays.asList(cards));        
        score = updateScore();
    }
    
    private int updateScore() {
        int result = 0;
        boolean hasAce = false;
        for (Card card: hand) {
            if (card == ACE) hasAce = true;
            result+= card.getValue();
        }
        return (result > BLACKJACK && hasAce) ? result -= (ACE.getValue() - 1): result;
    }
    
    
    public Card[] toArray() {
    	Card[] arr = new Card[hand.size()];
    	  int i = 0;
    	  for (Card card : hand) {
    	    arr[i] = card;
    	    i++;
    	  }
    	  return arr;
    }
    
    private boolean isBlackJack() {
    	return hand.contains(Card.ACE) && hand.contains(Card.JACK);
    }
    
}
