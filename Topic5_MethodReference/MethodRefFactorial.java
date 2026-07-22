public class MethodRefFactorial {

    public int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        MethodRefFactorial calculator = new MethodRefFactorial();

        FactorialFunction function = calculator::factorial;

        System.out.println("factorial(5) via method reference = " + function.apply(5));
        System.out.println("factorial(7) via method reference = " + function.apply(7));
    }
}
