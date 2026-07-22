public class FirstTwoRepeat {

    static String repeatFirstTwo(String input) {
        String firstTwo = input.substring(0, 2);
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < input.length(); i++) {
            result.append(firstTwo);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println("Wipro -> " + repeatFirstTwo("Wipro"));
        System.out.println("Java  -> " + repeatFirstTwo("Java"));
    }
}
