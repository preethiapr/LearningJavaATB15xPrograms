package ex_15_StringBuffer_Builder_StringFunctions;

import java.util.Scanner;

public class Lab150_String_Palindrome {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the String!!");
        String input = scanner.next();
        String reverse = "";
        for (int i = input.length()-1;i>=0; i--){
            reverse = reverse + input.charAt(i);
        }
        System.out.println(reverse);
        if (reverse.equalsIgnoreCase(input)){
            System.out.println("Entered Text is Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }
}
