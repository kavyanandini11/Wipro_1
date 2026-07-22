import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class PrimesLambda {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random(42);
        for (int i = 0; i < 25; i++) {
            numbers.add(random.nextInt(100) + 1);
        }

        Predicate<Integer> isPrime = n -> {
            if (n < 2) {
                return false;
            }
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };

        System.out.println("Generated numbers: " + numbers);
        System.out.print("Prime numbers    : ");
        numbers.forEach(n -> {
            if (isPrime.test(n)) {
                System.out.print(n + " ");
            }
        });
        System.out.println();
    }
}
