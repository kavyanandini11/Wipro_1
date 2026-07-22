public class ShortLongShort {

    static String shortLongShort(String a, String b) {
        String shorter = a.length() <= b.length() ? a : b;
        String longer = a.length() <= b.length() ? b : a;
        return shorter + longer + shorter;
    }

    public static void main(String[] args) {
        System.out.println("hi, hello -> " + shortLongShort("hi", "hello"));
        System.out.println("code, go  -> " + shortLongShort("code", "go"));
    }
}
