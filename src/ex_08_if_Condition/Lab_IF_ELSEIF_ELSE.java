package ex_08_if_Condition;

import java.util.Scanner;

public class Lab_IF_ELSEIF_ELSE {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the age= ");
        int age = scanner.nextInt();
        //String name = scanner.next();
        //int age = 34;
        if (age>34){
            System.out.println("age > 34");
        } else if (age < 34) {
            System.out.println( "age < 34");
        }
        else {
            System.out.println("age == 34");
        }
        scanner.close();




    }
}
