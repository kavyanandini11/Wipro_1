public class ReverseTwoByTwo {
    public static void main(String[] args) {
        if (args.length < 4) {
            System.out.println("Please provide four integers as command-line arguments.");
            System.out.println("Example: java ReverseTwoByTwo 1 2 3 4");
            return;
        }
        int[][] matrix = new int[2][2];
        int index = 0;
        try {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    matrix[i][j] = Integer.parseInt(args[index]);
                    index++;
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("All four arguments must be valid integers.");
            return;
        }

        System.out.println("Original 2x2 array:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Reversed 2x2 array:");
        for (int i = 1; i >= 0; i--) {
            for (int j = 1; j >= 0; j--) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
