import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PalindromePredicateDemo {

    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "level", "world", "madam", "java", "radar",
                "noon", "hello", "civic", "code", "refer");

        Predicate<String> isPalindrome = word -> {
            String reversed = new StringBuilder(word).reverse().toString();
            return word.equals(reversed);
        };

        System.out.println("All words: " + words);
        System.out.print("Palindrome words: ");
        for (String word : words) {
            if (isPalindrome.test(word)) {
                System.out.print(word + " ");
            }
        }
        System.out.println();
    }
}
