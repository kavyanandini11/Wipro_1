import java.util.Arrays;

public class WithoutTen {
    public static int[] withoutTen(int[] numbers) {
        int[] result = new int[numbers.length];
        int index = 0;
        for (int n : numbers) {
            if (n != 10) {
                result[index] = n;
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 10, 10, 2};
        int[] result = withoutTen(numbers);
        System.out.println(Arrays.toString(result));
    }
}
