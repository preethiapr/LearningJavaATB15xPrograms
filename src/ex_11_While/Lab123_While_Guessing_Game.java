package ex_11_While;

import java.util.Random;
import java.util.Scanner;

import static com.sun.beans.introspect.PropertyInfo.Name.bound;

public class Lab123_While_Guessing_Game {
    static void main(String[] args) {

        Random random = new Random();
        int numberToGuess = random.nextInt();
        System.out.println(numberToGuess);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 1-100");
        int guess;
        int attempts = 0;
         while (true){
             if (!scanner.hasNextInt()){
                 System.out.println("Enter a valid input");
                 scanner.next();
                 continue;
             }
             guess = scanner.nextInt();
             attempts++;
             if (guess < numberToGuess){
                 System.out.println("Entered number is low, Try again!!");
             } else if (guess > numberToGuess) {
                 System.out.println("Entered number is high, Try again!!");
             }
             else {
                 System.out.println("Correct! You have taken -> "+attempts);
                 break;
             }
         }



    }
}
