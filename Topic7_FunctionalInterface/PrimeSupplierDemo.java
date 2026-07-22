import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class PrimeSupplierDemo {

    public static void main(String[] args) {
        Supplier<List<Integer>> firstTenPrimes = () -> {
            List<Integer> primes = new ArrayList<>();
            int number = 2;
            while (primes.size() < 10) {
                if (isPrime(number)) {
                    primes.add(number);
                }
                number++;
            }
            return primes;
        };

        System.out.println("First 10 prime numbers: " + firstTenPrimes.get());
    }

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
