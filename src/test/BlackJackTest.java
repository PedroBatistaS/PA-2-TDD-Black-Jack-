package test;

import blackjack.*;
import static blackjack.Card.*;
import static org.junit.Assert.*;
import org.junit.Test;


public class BlackJackTest {
    
    @Test
    public void TestGetWinners() {
        
        Hand p1 = new Hand();        
        Hand p2 = new Hand();        
        Hand p3 = new Hand();        
        Hand crupier = new Hand();        
        Hand deck = new Hand();
        
        p1.add(JACK, ACE);        
        p2.add(QUEEN, FIVE, SIX);        
        p3.add(THREE, SIX, ACE, THREE, ACE, KING);
        crupier.add(NINE, SEVEN, FIVE);        
        deck.add(TWO);
        String[] result = {"Player 1"};
        assertArrayEquals(result, BlackJack.getWinners(p1,p2,p3,crupier, deck));        
    }
    
    @Test
    public void TestGetWinners1() {
        Hand p11 = new Hand();
        Hand p12 = new Hand();
        Hand p13 = new Hand();
        Hand crupier1 = new Hand();
        Hand deck1 = new Hand();
        
        p11.add(JACK, KING);
        p12.add(JACK, TWO,SIX);
        p13.add(EIGHT, EIGHT, FIVE);        
        crupier1.add(FIVE, JACK);        
        deck1.add(ACE, THREE, KING, TWO);
        
        String[] result1 = {"Player 1", "Player 3"};
        assertArrayEquals(result1, BlackJack.getWinners(p11,p12,p13,crupier1, deck1));
    }
    
    @Test
    public void TestGetWinners2() {
        Hand p21 = new Hand();
        Hand p22 = new Hand();
        Hand p23 = new Hand();
        Hand crupier2 = new Hand();
        Hand deck2 = new Hand();
        
        p21.add(JACK, KING);        
        p22.add(JACK,FIVE, SIX);        
        p23.add(THREE, SIX, ACE, THREE, ACE, KING);
        crupier2.add(NINE, SEVEN);        
        deck2.add(FIVE, FOUR, KING, TWO);
        
        String[] result2 = {};
        assertArrayEquals(result2, BlackJack.getWinners(p21,p22,p23,crupier2, deck2));
    }
    
}
