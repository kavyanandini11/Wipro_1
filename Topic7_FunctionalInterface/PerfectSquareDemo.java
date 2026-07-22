import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PerfectSquareDemo {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(16, 20, 25, 30, 36, 40, 49, 50, 64, 80);

        Predicate<Integer> isPerfectSquare = n -> {
            int root = (int) Math.sqrt(n);
            return root * root == n;
        };

        System.out.println("All numbers: " + numbers);
        System.out.print("Perfect squares: ");
        for (int number : numbers) {
            if (isPerfectSquare.test(number)) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
}
