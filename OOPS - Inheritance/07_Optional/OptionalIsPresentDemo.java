import java.util.Optional;

public class OptionalIsPresentDemo {

    public static void main(String[] args) {
        String[] words = { "Java", null, "Optional" };

        for (String word : words) {
            Optional<String> optional = Optional.ofNullable(word);
            if (optional.isPresent()) {
                System.out.println("Length of '" + optional.get() + "' is " + optional.get().length());
            } else {
                System.out.println("Value is absent, skipping to avoid NullPointerException.");
            }
        }
    }
}
