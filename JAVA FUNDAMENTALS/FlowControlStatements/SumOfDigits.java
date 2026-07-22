public class SumOfDigits {
    public static void main(String[] args) {
        int number = 1234;
        int original = number;
        int sum = 0;
        for (int n = number; n > 0; n = n / 10) {
            sum = sum + (n % 10);
        }
        System.out.println("Sum of digits of " + original + " is " + sum);
    }
}
