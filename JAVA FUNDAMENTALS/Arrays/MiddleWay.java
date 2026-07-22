import java.util.Arrays;

public class MiddleWay {
    public static int[] middleWay(int[] a, int[] b) {
        return new int[] { a[1], b[1] };
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        System.out.println(Arrays.toString(middleWay(a, b)));
    }
}
