public class FirstHalf {

    static String firstHalf(String input) {
        if (input.length() % 2 == 0) {
            return input.substring(0, input.length() / 2);
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println("TomCat -> " + firstHalf("TomCat"));
        System.out.println("Apron  -> " + firstHalf("Apron"));
    }
}
