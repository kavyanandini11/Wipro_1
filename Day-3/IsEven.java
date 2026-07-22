public class IsEven {

    static int isEven(int number) {
        if (number % 2 == 0) {
            return 2;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println("isEven(10) = " + isEven(10));
        System.out.println("isEven(7)  = " + isEven(7));
        System.out.println("isEven(0)  = " + isEven(0));
        System.out.println("isEven(-4) = " + isEven(-4));
    }
}
