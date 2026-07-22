public class RepeatLastN {

    static String repeatLastN(String input, int n) {
        if (n > input.length()) {
            n = input.length();
        }
        String lastN = input.substring(input.length() - n);
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < n; i++) {
            result.append(lastN);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println("Wipro, 3 -> " + repeatLastN("Wipro", 3));
        System.out.println("Java, 2  -> " + repeatLastN("Java", 2));
    }
}
