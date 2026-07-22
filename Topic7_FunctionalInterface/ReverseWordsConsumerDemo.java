import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ReverseWordsConsumerDemo {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of(
                "apple", "banana", "cherry", "date", "elder",
                "fig", "grape", "honey", "iris", "jelly"));

        System.out.println("Before: " + words);

        Consumer<List<String>> reverseEach = list -> {
            for (int i = 0; i < list.size(); i++) {
                String reversed = new StringBuilder(list.get(i)).reverse().toString();
                list.set(i, reversed);
            }
        };
        reverseEach.accept(words);

        System.out.println("After : " + words);
    }
}
