// 3c Q10: Counting the number of words in a string using countWords()

public class _3c10_CountWords {
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) return 0;
        return str.trim().split("\s+").length;
    }

    public static void main(String[] args) {
        String input = "my name is KVEERESH and my college is Alvas Engineering college and B section USN 4AL22CS068";
        System.out.println("Original: " + input);
        System.out.println("Word Count: " + countWords(input));
    }
}
