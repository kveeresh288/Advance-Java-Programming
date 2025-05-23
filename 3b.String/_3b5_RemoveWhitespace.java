// 3b Q5: Write a Java Program for Eliminating all whitespace characters from a string using user-defined function removeWhitespace()

//code :

public class _3b5_RemoveWhitespace {

    public static String removeWhitespace(String str) {
        return str.replaceAll("\s+", "");
    }

    public static void main(String[] args) {
        String input = " J A V A C O D E R V E E R E S H ";
        System.out.println(input);
        System.out.println("Cleaned: '" + removeWhitespace(input) + "'");
    }
}
