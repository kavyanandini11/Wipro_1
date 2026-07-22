public class RemoveXEnds {

    static String removeX(String input) {
        if (input.isEmpty()) {
            return input;
        }
        if (input.charAt(0) == 'x') {
            input = input.substring(1);
        }
        if (!input.isEmpty() && input.charAt(input.length() - 1) == 'x') {
            input = input.substring(0, input.length() - 1);
        }
        return input;
    }

    public static void main(String[] args) {
        System.out.println("xHix    -> " + removeX("xHix"));
        System.out.println("America -> " + removeX("America"));
    }
}
