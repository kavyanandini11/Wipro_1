public class MethodRefDigitCount {

    public static int digitCount(int n) {
        n = Math.abs(n);
        if (n == 0) {
            return 1;
        }
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        DigitCountFunction function = MethodRefDigitCount::digitCount;

        System.out.println("digitCount(12345) via static method reference = " + function.apply(12345));
        System.out.println("digitCount(-908) via static method reference  = " + function.apply(-908));
    }
}
