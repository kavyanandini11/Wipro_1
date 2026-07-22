public class Only14 {
    public static boolean only14(int[] numbers) {
        for (int n : numbers) {
            if (n != 1 && n != 4) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 1, 4};
        int[] b = {1, 4, 2, 4};
        System.out.println("{1,4,1,4} -> " + only14(a));
        System.out.println("{1,4,2,4} -> " + only14(b));
    }
}
