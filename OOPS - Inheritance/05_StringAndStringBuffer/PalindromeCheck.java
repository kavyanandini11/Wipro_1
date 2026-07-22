public class PalindromeCheck {

    static boolean isPalindrome(String input) {
        String reversed = new StringBuffer(input).reverse().toString();
        return input.equals(reversed);
    }

    public static void main(String[] args) {
        System.out.println("madam -> " + isPalindrome("madam"));
        System.out.println("level -> " + isPalindrome("level"));
        System.out.println("hello -> " + isPalindrome("hello"));
    }
}
