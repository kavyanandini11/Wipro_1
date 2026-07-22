public class ConcatLowerNoDouble {

    static String concatenate(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (a.charAt(a.length() - 1) == b.charAt(0)) {
            return a + b.substring(1);
        }
        return a + " " + b;
    }

    public static void main(String[] args) {
        System.out.println("Sachin + Tendulkar -> " + concatenate("Sachin", "Tendulkar"));
        System.out.println("Mark + kate        -> " + concatenate("Mark", "kate"));
    }
}
