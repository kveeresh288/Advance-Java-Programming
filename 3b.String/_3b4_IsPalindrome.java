// 3b Q4: Write a Java Program for Checking if a string reads the same backward as forward (ignoring case and punctuation) using user-defined function isPalindrome()

//code :

public class _3b4_IsPalindrome {

    public static boolean isPalindrome(String str) {
        String clean = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return clean.equals(new StringBuilder(clean).reverse().toString());
    }

    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        System.out.println(input);
        System.out.println("Is palindrome: " + isPalindrome(input));
    }
}
