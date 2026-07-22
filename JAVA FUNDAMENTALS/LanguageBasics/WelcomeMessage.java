public class WelcomeMessage {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide a name as a command-line argument.");
            System.out.println("Example: java WelcomeMessage John");
            return;
        }
        System.out.println("Welcome " + args[0]);
    }
}
