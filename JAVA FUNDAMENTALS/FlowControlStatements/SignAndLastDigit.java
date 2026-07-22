public class SignAndLastDigit {
    public static boolean lastDigit(int a, int b) {
        return (a % 10) == (b % 10);
    }

    public static void main(String[] args) {
        int number = -25;
        if (number > 0) {
            System.out.println(number + " is Positive");
        } else if (number < 0) {
            System.out.println(number + " is Negative");
        } else {
            System.out.println(number + " is Zero");
        }

        System.out.println("lastDigit(7, 17) = " + lastDigit(7, 17));
        System.out.println("lastDigit(6, 17) = " + lastDigit(6, 17));
        System.out.println("lastDigit(3, 113) = " + lastDigit(3, 113));
    }
}
