public class PrimeBetween {
    public static void main(String[] args) {
        for (int number = 10; number <= 99; number++) {
            boolean isPrime = true;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
}
