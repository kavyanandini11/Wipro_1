public class AsciiToChar {
    public static void main(String[] args) {
        int[] asciiValues = {72, 101, 108, 108, 111};
        for (int value : asciiValues) {
            System.out.print((char) value);
        }
        System.out.println();
    }
}
