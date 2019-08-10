package card;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class cardTest {
    
    @Test
    public void testGetSetValue() {
        card newCard = new card();
        newCard.setValue("KING");
        assertEquals("KING", newCard.getValue());
    }
    
    @Test
    public void testGetSetSuit() {
        card newCard = new card();
        newCard.setSuit("HEARTS");
        assertEquals("HEARTS", newCard.getSuit());
    }
}
