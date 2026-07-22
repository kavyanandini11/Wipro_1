public class BiggestInThreeByThree {
    public static void main(String[] args) {
        if (args.length < 9) {
            System.out.println("Please provide nine integers as command-line arguments.");
            System.out.println("Example: java BiggestInThreeByThree 3 8 1 5 9 2 7 4 6");
            return;
        }
        int[][] matrix = new int[3][3];
        int index = 0;
        try {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matrix[i][j] = Integer.parseInt(args[index]);
                    index++;
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("All nine arguments must be valid integers.");
            return;
        }

        int biggest = matrix[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] > biggest) {
                    biggest = matrix[i][j];
                }
            }
        }

        System.out.println("3x3 array:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Biggest number = " + biggest);
    }
}
