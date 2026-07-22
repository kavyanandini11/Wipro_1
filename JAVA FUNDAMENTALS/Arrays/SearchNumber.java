public class SearchNumber {
    public static int search(int[] numbers, int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 4, 34, 56, 7};
        System.out.println("Searching 90 -> " + search(numbers, 90));
        System.out.println("Searching 56 -> " + search(numbers, 56));
    }
}
