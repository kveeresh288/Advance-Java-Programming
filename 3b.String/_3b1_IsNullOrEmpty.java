// 3b Q1: Write a Java Program for Checking if a given string is null or contains only whitespace using user-defined function isNullOrEmpty()

//code :

import java.util.*;

public class _3b1_IsNullOrEmpty {

    public static boolean isNullOrEmpty(String str) {
	        return str == null || str.trim().isEmpty();
	    }
	    public static void main(String[] args) {
	        String input = "   ";
	        System.out.println("The input String is: '"+ input +"'");
	        System.out.println("Is null or empty: " + isNullOrEmpty(input));
	    }
}
