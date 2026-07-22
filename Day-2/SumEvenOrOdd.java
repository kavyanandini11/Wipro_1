import java.util.Scanner;

public class SumEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int sum = a + b;
        if (sum % 2 == 0) {
            System.out.println("Their sum " + sum + " is EVEN");
        } else {
            System.out.println("Their sum " + sum + " is ODD");
        }
        sc.close();
    }
}
