import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectUniqueSymbols {

    public static void main(String[] args) {
        List<Card> cards = new ArrayList<>();
        cards.add(new Card("Ace", "Spades"));
        cards.add(new Card("King", "Hearts"));
        cards.add(new Card("Ten", "Spades"));
        cards.add(new Card("Queen", "Diamonds"));
        cards.add(new Card("Two", "Hearts"));
        cards.add(new Card("Five", "Clubs"));
        cards.add(new Card("Nine", "Diamonds"));

        Set<String> uniqueSymbols = new HashSet<>();
        for (Card card : cards) {
            uniqueSymbols.add(card.getSymbol());
        }

        System.out.println("Total cards        : " + cards.size());
        System.out.println("Unique symbols     : " + uniqueSymbols);
        System.out.println("Number of symbols  : " + uniqueSymbols.size());
    }
}
