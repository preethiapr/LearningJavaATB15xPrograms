package ex_08_if_Condition;

public class Lab081_If_P1 {
    static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        if (age > 25){
            System.out.println("You can go to Goa!");
        }
        else {
            System.out.println("You can't go to Goa");
        }
    }
}
