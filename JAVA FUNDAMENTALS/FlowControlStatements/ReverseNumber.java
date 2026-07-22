public class ReverseNumber {
    public static void main(String[] args) {
        int number = 1004;
        int original = number;
        int reversed = 0;
        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }
        System.out.println("Reverse of " + original + " is " + reversed);
    }
}
