public class InterleaveStrings {

    static String interleave(String a, String b) {
        StringBuffer result = new StringBuffer();
        int i = 0;
        while (i < a.length() || i < b.length()) {
            if (i < a.length()) {
                result.append(a.charAt(i));
            }
            if (i < b.length()) {
                result.append(b.charAt(i));
            }
            i++;
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println("Hello, World -> " + interleave("Hello", "World"));
        System.out.println("abc, 12345   -> " + interleave("abc", "12345"));
    }
}
