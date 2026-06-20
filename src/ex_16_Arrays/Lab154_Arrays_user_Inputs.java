package ex_16_Arrays;

import java.util.Scanner;

public class Lab154_Arrays_user_Inputs {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the size of the array");
        int size = scanner.nextInt();
        int[] marks_number =  new int[size];

        for(int i = 0; i < marks_number.length; i++){
            System.out.println("Enter the marks"+marks_number[i]);
            marks_number[i] = scanner.nextInt();
        }
        System.out.println("==========================");

        for (int i = 0; i < marks_number.length; i++){
            System.out.println(marks_number[i]);
        }
    }
}
