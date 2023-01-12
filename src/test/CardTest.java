/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package test;

import blackjack.Card;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 *
 * @author Pedro
 */
public class CardTest {
    
    
    @Test
    public void shouldreturnvalue() {
        assertEquals(Card.TWO.getValue(), 2);
        assertEquals(Card.THREE.getValue(), 3);
        assertEquals(Card.FOUR.getValue(), 4);
        assertEquals(Card.FIVE.getValue(), 5);
        assertEquals(Card.SIX.getValue(), 6);
        assertEquals(Card.SEVEN.getValue(), 7);
        assertEquals(Card.EIGHT.getValue(), 8);
        assertEquals(Card.NINE.getValue(), 9);
        assertEquals(Card.JACK.getValue(), 10);
        assertEquals(Card.QUEEN.getValue(), 10);
        assertEquals(Card.KING.getValue(), 10);
        assertEquals(Card.ACE.getValue(), 11);
    }  
}
