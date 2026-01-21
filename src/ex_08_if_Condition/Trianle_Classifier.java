package ex_08_if_Condition;

import java.util.Scanner;

public class Trianle_Classifier {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please evter the value of side a = ");
        int a = scanner.nextInt();
        System.out.println("Please evter the value of side b = ");
        int b = scanner.nextInt();
        System.out.println("Please evter the value of side c = ");
        int c = scanner.nextInt();
        if (a==b && b==c){
            System.out.println("It is an Equivalent10 Triangle");
        } else if (a==b || b==c || c==a) {
            System.out.println("It is an isoscelus Trianle");

        }else {
            System.out.println("It is a scalene Triangle");
        }


    }

}
