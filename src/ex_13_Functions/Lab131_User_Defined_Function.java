package ex_13_Functions;

import java.util.Scanner;

public class Lab131_User_Defined_Function {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number value for a=");
        int a = scan.nextInt();
        System.out.println("Enter a number value for b=");
        int b = scan.nextInt();
        int sum = sum_of_two_numbers(a,b);
        System.out.println("Sum of the numbers as ="+sum);
    }
    static int sum_of_two_numbers(int a, int b){
        return a+b;
    }
 static void sum_of_numbers(){
     System.out.println("Hi, there");
 }
}
