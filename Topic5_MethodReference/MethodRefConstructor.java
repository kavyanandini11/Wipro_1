public class MethodRefConstructor {

    public static void main(String[] args) {
        PrimeCheckerFactory factory = PrimeChecker::new;

        System.out.println("Invoking the constructor via a constructor reference:");
        factory.create(7);
        factory.create(10);
        factory.create(13);
    }
}
