public class WordCountLambda {

    public static void main(String[] args) {
        WordCount wordCount = str -> str.trim().isEmpty() ? 0 : str.trim().split("\\s+").length;

        String sentence1 = "Java lambda expressions are powerful";
        String sentence2 = "Collections framework";

        System.out.println("\"" + sentence1 + "\" -> " + wordCount.count(sentence1) + " words");
        System.out.println("\"" + sentence2 + "\" -> " + wordCount.count(sentence2) + " words");
    }
}
