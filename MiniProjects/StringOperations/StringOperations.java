import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringOperations {

    public static void main(String[] args) {
        String sentence = "the quick brown fox jumps over the lazy dog";
        System.out.println("Sentence: " + sentence);

        List<String> words = new ArrayList<>();
        for (String word : sentence.split(" ")) {
            words.add(word);
        }

        System.out.println("Word count      : " + words.size());

        List<String> upper = new ArrayList<>();
        for (String word : words) {
            upper.add(word.toUpperCase());
        }
        System.out.println("Uppercase words : " + upper);

        List<String> sorted = new ArrayList<>(words);
        Collections.sort(sorted);
        System.out.println("Sorted words    : " + sorted);

        String longest = words.get(0);
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        System.out.println("Longest word    : " + longest);

        System.out.println("Contains 'fox'  : " + words.contains("fox"));
        System.out.println("Joined back     : " + String.join(" ", words));
    }
}
