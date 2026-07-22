import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectAndGroupCards {

    public static void main(String[] args) {
        List<Card> cards = new ArrayList<>();
        cards.add(new Card("Ace", "Spades"));
        cards.add(new Card("King", "Hearts"));
        cards.add(new Card("Ten", "Spades"));
        cards.add(new Card("Queen", "Diamonds"));
        cards.add(new Card("Two", "Hearts"));
        cards.add(new Card("Five", "Clubs"));
        cards.add(new Card("Nine", "Diamonds"));

        Map<String, List<Card>> groupedBySuit = new HashMap<>();
        for (Card card : cards) {
            groupedBySuit.computeIfAbsent(card.getSuit(), key -> new ArrayList<>()).add(card);
        }

        System.out.println("Cards grouped by suit:");
        for (Map.Entry<String, List<Card>> entry : groupedBySuit.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
