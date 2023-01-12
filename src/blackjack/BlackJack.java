package blackjack;
import static blackjack.Card.*;
import java.util.*;
import org.junit.runner.JUnitCore;

public class BlackJack {

    public static void main(String[] args) {
        
        String[] testClasses = {"test.BlackJackTest", "test.HandTest", "test.CardTest"};
        JUnitCore.main(testClasses);
        
    }
    
    
    public static String[] getWinners(Hand player1, Hand player2, Hand player3, Hand crupier, Hand deck) {
    	List<String> winners = new ArrayList<>();
        
        Hand[] players = new Hand[3];
        players[0] = player1;
        players[1] = player2;
        players[2] = player3;
        
        List<Card> d = deck.getHand();
        int i = 0;
        
        while (crupier.getScore() < 17) {
            if (crupier.isBlackjack()) {
                return new String[0];
            }
            crupier.add(deck.getHand().get(i));
            i++;
        }
        
        int x = 1;
        int y = 0;
        
        for (int j = 0; j < players.length; j++) {
            if (players[j].isBlackjack() 
                || players[j].getScore() > crupier.getScore() 
                && !players[j].isBust()) winners.add("Player " + x); 
                x++;
        }
        String[] result = new String[winners.size()];
        for (String winner : winners) {
            result[y] = winner;
            y++;
        }        
    	return result;
    }
    
}
