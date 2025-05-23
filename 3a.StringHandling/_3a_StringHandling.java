// 3a. Develop a java program for performing various string operations with different string
// handling functions directed as follows:
// String Creation and Basic Operations, Length and Character Access, String Comparison,
// String Searching, Substring Operations, String Modification, Whitespace Handling,
// String Concatenation, String Splitting, StringBuilder Demo, String Formatting,
// Validate Email with contains( ) and startsWith() and endsWith()

// Code:

public class _3a_StringHandling {
    public static void main(String[] args) {
        // String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

        // String Comparison
        System.out.println("str1 equals str2? " + str1.equals(str2));
        System.out.println("str1 compareTo str2: " + str1.compareTo(str2));

        // String Searching
        String sentence = "Welcome to AIET Campus";
        System.out.println("Index of 'AIET': " + sentence.indexOf("AIET"));

        // Substring Operations
        System.out.println("Substring from index 11: " + sentence.substring(11));
        System.out.println("Substring (11 to 15): " + sentence.substring(11, 15));

        // String Modification
        System.out.println("Replace 'AIET' with 'College': " + sentence.replace("AIET", "College"));

        // Whitespace Handling
        String withSpaces = "   Trim this   ";
        System.out.println("Before trim: '" + withSpaces + "'");
        System.out.println("After trim: '" + withSpaces.trim() + "'");

        // String Concatenation
        String full = str1.concat(" ").concat(str2);
        System.out.println("Concatenated String: " + full);

        // String Splitting
        String colors = "Red,Green,Blue";
        String[] colorArray = colors.split(",");
        System.out.println("Colors:");
        for (String color : colorArray) {
            System.out.println(color);
        }

        // StringBuilder Demo
        StringBuilder sb = new StringBuilder("AIET");
        sb.append(" College");
        sb.insert(0, "Welcome to ");
        sb.replace(11, 16, "Engineering");
        System.out.println("StringBuilder result: " + sb);

        // String Formatting
        String name = "Veeresh";
        int age = 21;
        System.out.println(String.format("Name: %s, Age: %d", name, age));

        // Email Validation
        String email = "Veeresh@aiet.edu";
        boolean isValid = email.contains("@") && email.endsWith(".edu") && email.startsWith("Veeresh");
        System.out.println("Is email valid? " + isValid);
    }
}