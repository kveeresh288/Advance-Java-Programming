// 3c Q7: Shortening a string to a specified length and adding an ellipsis using truncate()

public class _3c7_Truncate {
    public static String truncate(String str, int maxLength) {
        if (str.length() <= maxLength) return str;
        return str.substring(0, maxLength) + "...";
    }

    public static void main(String[] args) {
        String input = "my name is KVEERESH and my college is Alvas Engineering college and B section USN 4AL22CS068";
        System.out.println("Original: " + input);
        System.out.println("Truncated: " + truncate(input, 30));
    }
}
