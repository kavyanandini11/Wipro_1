public class CaseConverter {
    public static void main(String[] args) {
        char ch = 'a';
        if (ch >= 'a' && ch <= 'z') {
            char upper = (char) (ch - 32);
            System.out.println(ch + "- " + upper);
        } else if (ch >= 'A' && ch <= 'Z') {
            char lower = (char) (ch + 32);
            System.out.println(ch + "- " + lower);
        } else {
            System.out.println("Not an alphabet");
        }
    }
}
