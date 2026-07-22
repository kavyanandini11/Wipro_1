public class Backward100To1Skip {
    public static void main(String[] args) {
        for (int i = 100; i >= 1; i = i - 3) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
