package ex_11_While;

import java.util.Scanner;

public class Lab121_While_IQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the positive integer number");
        int num = scanner.nextInt();
        int fact = 1;
        int i = 1;
        while (i <=num){
            fact = fact*i;
            i++;
        }
        System.out.println(fact);
    }
}
