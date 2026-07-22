public class IsOdd {

    static int isOdd(int number) {
        if (number % 2 != 0) {
            return 2;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println("isOdd(7)  = " + isOdd(7));
        System.out.println("isOdd(10) = " + isOdd(10));
        System.out.println("isOdd(0)  = " + isOdd(0));
        System.out.println("isOdd(-3) = " + isOdd(-3));
    }
}
