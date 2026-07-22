import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 12, 45, 67, 89};
        int[] result = new int[numbers.length];
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            boolean found = false;
            for (int j = 0; j < count; j++) {
                if (result[j] == numbers[i]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result[count] = numbers[i];
                count++;
            }
        }
        int[] finalResult = Arrays.copyOf(result, count);
        System.out.println("After removing duplicates: " + Arrays.toString(finalResult));
    }
}
