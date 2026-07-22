public class PrimeChecker {

    public PrimeChecker(int number) {
        boolean prime = number >= 2;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
        System.out.println(number + " is " + (prime ? "Prime" : "Not Prime"));
    }
}
