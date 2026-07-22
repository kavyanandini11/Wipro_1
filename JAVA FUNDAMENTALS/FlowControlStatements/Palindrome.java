public class Palindrome {
    public static void main(String[] args) {
        int number = 110011;
        int original = number;
        int reversed = 0;
        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }
        if (reversed == original) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is not a Palindrome");
        }
    }
}
