import java.util.Arrays;

public class EvenOdd {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 4, 7, 6, 1, 8};
        int[] result = new int[numbers.length];
        int index = 0;
        for (int n : numbers) {
            if (n % 2 == 0) {
                result[index] = n;
                index++;
            }
        }
        for (int n : numbers) {
            if (n % 2 != 0) {
                result[index] = n;
                index++;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
