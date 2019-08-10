package card;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class deck {
    private String[] SUIT_VALUES = {"HEARTS", "DIAMONDS", "SPADES", "CLUBS"};
    private String[] CARD_VALUES = {"ACE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "JACK", "QUEEN", "KING"};
    private List<card> cardDeck = new ArrayList<card>();
    private Random random = new Random();

    public deck(){
        this.createDeck();   
    }
    
    public void createDeck(){
        this.cardDeck.clear();
        for(int i=0; i<this.SUIT_VALUES.length; ++i){
            for(int j=0; j<this.CARD_VALUES.length; ++j){
                card newCard = new card();
                newCard.setSuit(this.SUIT_VALUES[i]);
                newCard.setValue(this.CARD_VALUES[i]);
                this.cardDeck.add(newCard);
            }
        }
    }
    
    public void shuffle(){
        this.createDeck();
        for(int i=0; i<this.cardDeck.size(); ++i){
            int hold = this.getRandom52();
            card holdCard = this.cardDeck.get(i);
            this.cardDeck.set(i, this.cardDeck.get(hold));
            this.cardDeck.set(hold, holdCard);
        }
    }
    
    private int getRandom52(){
        return random.nextInt(52);
    }
    
    public card drawOneCard(){
        if(this.cardDeck.size() > 1){
            card holdCard = this.cardDeck.get(0);
            this.cardDeck.remove(0);
            return holdCard;
        }
        return null;
    }
    
    public List<card> getDeck(){
        return cardDeck;
    }
    
    public void setDeck(List<card> data){
        this.cardDeck = data;
    }
}