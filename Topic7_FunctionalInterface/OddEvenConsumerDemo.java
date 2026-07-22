import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class OddEvenConsumerDemo {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(11, 24, 37, 42, 55, 68, 70, 81);

        Consumer<Integer> printOddEven = n ->
                System.out.println(n + " is " + (n % 2 == 0 ? "Even" : "Odd"));

        numbers.forEach(printOddEven);
    }
}
