public class WithoutFirstChar {

    static String withoutFirst(String input) {
        if (input.length() <= 1) {
            return "";
        }
        return input.substring(1);
    }

    public static void main(String[] args) {
        System.out.println("Suman -> " + withoutFirst("Suman"));
        System.out.println("Hello -> " + withoutFirst("Hello"));
    }
}
