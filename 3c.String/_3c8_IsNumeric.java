// 3c Q8: Verifying if a string contains only numeric characters using isNumeric()

public class _3c8_IsNumeric {
    public static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }

    public static void main(String[] args) {
        String input = "4AL22CS068";
        System.out.println("Input: " + input);
        System.out.println("Is numeric: " + isNumeric(input));
    }
}
