public class SecondLastDigit {

    static int secondLastDigit(int number) {
        number = Math.abs(number);
        if (number < 10) {
            return -1;
        }
        return (number / 10) % 10;
    }

    public static void main(String[] args) {
        System.out.println("secondLastDigit(197)  = " + secondLastDigit(197));
        System.out.println("secondLastDigit(-197) = " + secondLastDigit(-197));
        System.out.println("secondLastDigit(5)    = " + secondLastDigit(5));
    }
}
