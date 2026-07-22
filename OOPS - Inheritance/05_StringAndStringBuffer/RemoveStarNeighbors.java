public class RemoveStarNeighbors {

    static String removeStar(String input) {
        int star = input.indexOf('*');
        if (star == -1) {
            return input;
        }
        String left = star > 0 ? input.substring(0, star - 1) : "";
        String right = star < input.length() - 1 ? input.substring(star + 2) : "";
        return left + right;
    }

    public static void main(String[] args) {
        System.out.println("ab*cd   -> " + removeStar("ab*cd"));
        System.out.println("code*rs -> " + removeStar("code*rs"));
    }
}
