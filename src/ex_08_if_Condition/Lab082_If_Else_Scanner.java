package ex_08_if_Condition;

import java.util.Scanner;

public class Lab082_If_Else_Scanner {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age!! =");
        int age = scanner.nextInt();
      //  double d = scanner.nextDouble();
      //  float f = scanner.nextFloat();
        System.out.println(age);
        if (age > 19){
            System.out.println("Hi");
        } else{
            System.out.println("Hello");
        }
    }
}
