/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package test;

import blackjack.*;
import static blackjack.Hand.BLACKJACK;
import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Pedro
 */
public class HandTest {
    
    @Test
    public void testGetHand() {
        Hand hand = new Hand();

        
        Card[] handArray = new Card[6];
        handArray[0] = Card.TWO;
        handArray[1] = Card.THREE;
        handArray[2] = Card.FOUR;
        handArray[3] = Card.FIVE;
        handArray[4] = Card.SIX;
        handArray[5] = Card.QUEEN;
        
        hand.add(Card.TWO);
        hand.add(Card.THREE);
        hand.add(Card.FOUR);
        hand.add(Card.FIVE);
        hand.add(Card.SIX);
        hand.add(Card.QUEEN); 
        
        assertArrayEquals(handArray, hand.toArray());
    }
    
    
    
    
    @Test
    public void testGetScore() {
        Hand hand = new Hand();
        Hand hand1 = new Hand();
        Hand hand2 = new Hand();
        
        hand.add(Card.TWO);
        hand.add(Card.THREE);
        hand.add(Card.FOUR);
        hand.add(Card.FIVE);
        hand.add(Card.SIX);
        hand.add(Card.QUEEN); 
        
        hand1.add(Card.KING);        
        hand1.add(Card.QUEEN);        
        hand1.add(Card.FIVE);
        
        hand2.add(Card.JACK);        
        hand2.add(Card.ACE);               
        
        assertEquals(hand.getScore(), 30);
        assertEquals(hand1.getScore(), 25);
        assertEquals(hand2.getScore(), BLACKJACK);
    }
    
    
    @Test
    public void testIsBlackJack() {
        Hand hand = new Hand();
        Hand hand1 = new Hand();
        Hand hand2 = new Hand();
        
        hand.add(Card.TWO);
        hand.add(Card.THREE);
        hand.add(Card.FOUR);
        hand.add(Card.FIVE);
        hand.add(Card.SIX);
        hand.add(Card.QUEEN); 
        
        hand1.add(Card.JACK);        
        hand1.add(Card.ACE);
        
        hand2.add(Card.ACE);               
        hand2.add(Card.QUEEN);               
        
        assertEquals(hand.isBlackjack(), false);
        assertEquals(hand1.isBlackjack(), true);
        assertEquals(hand2.isBlackjack(), false);
    }
    
    
    @Test
    public void testIsBust() {
        Hand hand = new Hand();
        Hand hand1 = new Hand();
        Hand hand2 = new Hand();
        
        hand.add(Card.TWO);
        hand.add(Card.FOUR);
        hand.add(Card.FIVE);
        hand.add(Card.SIX);
        hand.add(Card.QUEEN); 
        
        hand1.add(Card.JACK);        
        hand1.add(Card.ACE);
        
        hand2.add(Card.ACE);               
        hand2.add(Card.QUEEN);               
        
        assertEquals(hand.isBust(), true);
        assertEquals(hand1.isBust(), false);
        assertEquals(hand2.isBust(), false);
    }
    
}
