// 3b Q3: Write a Java Program for Reversing the characters in a string using user-defined function reverseString()

//code :

public class _3b3_ReverseString {

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        String input = "Veeresh";
        System.out.println("Original String: " +input);
        System.out.println("Reversed: " + reverseString(input));
    }
}
