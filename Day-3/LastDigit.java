public class LastDigit {

    static int lastDigit(int number) {
        number = Math.abs(number);
        return number % 10;
    }

    public static void main(String[] args) {
        System.out.println("lastDigit(197)  = " + lastDigit(197));
        System.out.println("lastDigit(-197) = " + lastDigit(-197));
        System.out.println("lastDigit(0)    = " + lastDigit(0));
    }
}
