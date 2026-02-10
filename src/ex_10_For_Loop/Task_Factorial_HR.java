package ex_10_For_Loop;

import java.util.Scanner;

public class Task_Factorial_HR {
    static void main(String[] args) {
        System.out.println("Welcome to Factorial Program");
        Scanner scanner = new Scanner(System.in);

        int fact = 1;
        if (scanner.hasNextInt()){
            int num = scanner.nextInt();
            System.out.println(num);
        for (int i=1; i<=num; i++ ){
           fact = fact*i;
        }
            System.out.println("Factorial of number is "+fact);
        }else {
            System.out.println("Please enter a valid input value");
        }
        scanner.close();
    }
}
