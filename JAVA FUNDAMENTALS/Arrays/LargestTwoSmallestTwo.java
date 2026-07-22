import java.util.Arrays;

public class LargestTwoSmallestTwo {
    public static void main(String[] args) {
        int[] numbers = {45, 12, 78, 3, 56, 91, 34};
        int[] sorted = numbers.clone();
        Arrays.sort(sorted);
        int n = sorted.length;
        System.out.println("Smallest two: " + sorted[0] + ", " + sorted[1]);
        System.out.println("Largest two: " + sorted[n - 1] + ", " + sorted[n - 2]);
    }
}
