public class MaxAndMin {
    public static void main(String[] args) {
        int[] numbers = {45, 12, 78, 3, 56, 91, 34};
        int max = numbers[0];
        int min = numbers[0];
        for (int n : numbers) {
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}
