import java.util.StringJoiner;

public class MergeJoiners {

    static StringJoiner buildS1() {
        StringJoiner s1 = new StringJoiner("-");
        s1.add("Delhi");
        s1.add("Mumbai");
        return s1;
    }

    static StringJoiner buildS2() {
        StringJoiner s2 = new StringJoiner("-");
        s2.add("Chennai");
        s2.add("Kolkata");
        return s2;
    }

    public static void main(String[] args) {
        System.out.println("s1 = " + buildS1());
        System.out.println("s2 = " + buildS2());

        StringJoiner s2First = buildS2();
        s2First.merge(buildS1());
        System.out.println("\n(i)  s1 merged into s2 : " + s2First);

        StringJoiner s1First = buildS1();
        s1First.merge(buildS2());
        System.out.println("(ii) s2 merged into s1 : " + s1First);
    }
}
