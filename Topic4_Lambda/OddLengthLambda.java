import java.util.ArrayList;
import java.util.List;

public class OddLengthLambda {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of(
                "sky", "ocean", "mountain", "sea", "river",
                "lake", "island", "cloud", "storm", "rain"));

        System.out.println("All words: " + words);
        System.out.print("Words with odd length: ");
        words.forEach(word -> {
            if (word.length() % 2 != 0) {
                System.out.print(word + "(" + word.length() + ") ");
            }
        });
        System.out.println();
    }
}
