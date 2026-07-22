import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NegativeEvenStream {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-4, 7, -3, -10, 5, -8, 2, -6, 9, -12);

        List<Integer> negativeEvens = numbers.stream()
                .filter(n -> n < 0 && n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Original numbers      : " + numbers);
        System.out.println("Negative even numbers : " + negativeEvens);
    }
}
