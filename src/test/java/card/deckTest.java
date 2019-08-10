package card;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import java.util.List;
import java.util.ArrayList;

@RunWith(JUnit4.class)
public class deckTest {
    @Test
    public void testGetSetDeck() {
        deck newDeck = new deck();
        List<card> cardList = new ArrayList<card>();
        card newCard = new card();

        newCard.setValue("TEN");
        newCard.setSuit("HEARTS");
        cardList.add(newCard);
        newDeck.setDeck(cardList);

        assertEquals(newDeck.getDeck(), cardList);
    }
    
    @Test
    public void testCreateDeck() {
        deck newDeck = new deck();
        newDeck.createDeck();

        assertEquals(52, newDeck.getDeck().size());
    }
    
    @Test
    public void testDrawOneCard() {
        deck newDeck = new deck();
        card newCard = newDeck.drawOneCard();

        assertEquals("HEARTS", newCard.getSuit());
        assertEquals("ACE", newCard.getValue());
    }
    
    @Test
    public void testShuffle() {
        deck newDeck = new deck();
        card newCard = newDeck.drawOneCard();
        newDeck.createDeck();
        newDeck.shuffle();
        
        List<card> holdDeck = newDeck.getDeck();
        int index = -1;
        
        for(int i=0; i<holdDeck.size(); ++i){
            if(holdDeck.get(i).getSuit().equals(newCard.getSuit()) 
                && holdDeck.get(i).getValue().equals(newCard.getValue())){
                index = i;
                break;
            }
        }
        assertNotEquals(index, -1);
    } 
}
