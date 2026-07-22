public class LambdaDemo {

    public static void main(String[] args) {
        Test t1 = (a, b, c) -> a + b + c;
        Test t2 = (a, b, c) -> a * b * c;

        int x = 4, y = 5, z = 6;

        System.out.println("Sum of " + x + ", " + y + ", " + z + " = " + t1.myFunction(x, y, z));
        System.out.println("Product of " + x + ", " + y + ", " + z + " = " + t2.myFunction(x, y, z));
    }
}
