import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseWordsLambda {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of(
                "apple", "banana", "cherry", "date", "elder",
                "fig", "grape", "honey", "iris", "jelly"));

        System.out.println("Original order: " + words);

        Collections.reverse(words);
        System.out.print("Reverse order : ");
        words.forEach(word -> System.out.print(word + " "));
        System.out.println();
    }
}
