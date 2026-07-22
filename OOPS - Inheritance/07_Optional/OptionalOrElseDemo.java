import java.util.Optional;

public class OptionalOrElseDemo {

    static String resolveAddress(String address) {
        return Optional.ofNullable(address).orElse("India");
    }

    public static void main(String[] args) {
        System.out.println("Address 1: " + resolveAddress("221B Baker Street, London"));
        System.out.println("Address 2: " + resolveAddress(null));
    }
}
