import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class SumFunctionDemo {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);

        Function<List<Integer>, Integer> sumFunction = list -> {
            int total = 0;
            for (int value : list) {
                total += value;
            }
            return total;
        };

        System.out.println("Numbers: " + numbers);
        System.out.println("Sum of all numbers: " + sumFunction.apply(numbers));
    }
}
