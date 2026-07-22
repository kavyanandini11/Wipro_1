public class SpecialSum {
    public static void main(String[] args) {
        int[] numbers = {10, 3, 6, 1, 2, 7, 9};
        int sum = 0;
        boolean skip = false;
        for (int n : numbers) {
            if (skip) {
                if (n == 7) {
                    skip = false;
                }
                continue;
            }
            if (n == 6) {
                skip = true;
                continue;
            }
            sum = sum + n;
        }
        System.out.println("Special sum = " + sum);
    }
}
