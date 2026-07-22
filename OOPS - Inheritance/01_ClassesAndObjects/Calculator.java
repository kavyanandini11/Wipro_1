public class Calculator {

    public static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

    public static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }

    public static void main(String[] args) {
        System.out.println("powerInt(2, 5)      = " + powerInt(2, 5));
        System.out.println("powerInt(3, 3)      = " + powerInt(3, 3));
        System.out.println("powerDouble(2.5, 2) = " + powerDouble(2.5, 2));
        System.out.println("powerDouble(1.5, 3) = " + powerDouble(1.5, 3));
    }
}
