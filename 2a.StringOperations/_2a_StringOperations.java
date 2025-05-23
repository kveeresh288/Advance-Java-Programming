// 2 a. Develop a java program for performing various string operations with different string
// handling functions directed as follows
// String Creation and Basic Operations, Length and Character Access, String Comparison, String
// Searching, Substring Operations , String Modification, Whitespace Handling, String
// Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email with
// contains( ) and startsWith() and endsWith()

//code :

public class _2a_StringOperations {
    public static void main(String[] args) {
        // String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("Original Strings: " + str1 + ", " + str2);

        // Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

        // String Comparison
        System.out.println("str1 equals str2? " + str1.equals(str2));
        System.out.println("str1 equalsIgnoreCase HELLO? " + str1.equalsIgnoreCase("HELLO"));

        // String Searching
        String sentence = "Java programming is powerful";
        System.out.println("Index of 'programming': " + sentence.indexOf("programming"));
        System.out.println("Contains 'Java'? " + sentence.contains("Java"));

        // Substring Operations
        String sub = sentence.substring(5, 16);
        System.out.println("Substring (5 to 16): " + sub);

        // String Modification
        System.out.println("Replace 'powerful' with 'awesome': " + sentence.replace("powerful", "awesome"));

        // Whitespace Handling
        String spaced = "   trimmed text   ";
        System.out.println("Before trim: '" + spaced + "'");
        System.out.println("After trim: '" + spaced.trim() + "'");

        // String Concatenation
        String concatenated = str1.concat(" ").concat(str2);
        System.out.println("Concatenated: " + concatenated);

        // String Splitting
        String colors = "Red,Green,Blue";
        String[] colorArray = colors.split(",");
        System.out.println("Splitting 'Red,Green,Blue':");
        for (String color : colorArray) {
            System.out.println(color);
        }

        // StringBuilder Demo
        StringBuilder sb = new StringBuilder("Welcome");
        sb.append(" to Java");
        sb.insert(8, "World ");
        sb.replace(0, 7, "Hello");
        sb.delete(6, 12);
        System.out.println("StringBuilder result: " + sb.toString());

        // String Formatting
        String name = "Alice";
        int age = 25;
        System.out.println(String.format("Name: %s, Age: %d", name, age));

        // Validate Email with contains(), startsWith(), endsWith()
        String email = "user@example.com";
        boolean isValid = email.contains("@") && email.endsWith(".com") && email.startsWith("user");
        System.out.println("Email '" + email + "' is valid? " + isValid);
    }
}