// 3c Q6: Capitalizing the first letter of each word using capitalizeWords()

public class _3c6_CapitalizeWords {
    public static String capitalizeWords(String str) {
        String[] words = str.split("\s+");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty())
                sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String input = "my name is KVEERESH and my college is Alvas Engineering college and B section USN 4AL22CS068";
        System.out.println("Original: " + input);
        System.out.println("Capitalized: " + capitalizeWords(input));
    }
}
