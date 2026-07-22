public class SumLastDigits {

    static int addLastDigits(int input1, int input2) {
        int last1 = Math.abs(input1) % 10;
        int last2 = Math.abs(input2) % 10;
        return last1 + last2;
    }

    public static void main(String[] args) {
        System.out.println("addLastDigits(267, 154)   = " + addLastDigits(267, 154));
        System.out.println("addLastDigits(267, -154)  = " + addLastDigits(267, -154));
        System.out.println("addLastDigits(-267, 154)  = " + addLastDigits(-267, 154));
        System.out.println("addLastDigits(-267, -154) = " + addLastDigits(-267, -154));
    }
}
