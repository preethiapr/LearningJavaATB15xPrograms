package ex_08_if_Condition;

public class Lab079_If {
    static void main(String[] args) {
        System.out.println("Enter the age via the CLI options\n");
        int age = Integer.parseInt(args[0]);
        if (age >= 18){
            System.out.println("You can vote!");
        } else {
            System.out.println("You can't vote");
        }
    }
}
