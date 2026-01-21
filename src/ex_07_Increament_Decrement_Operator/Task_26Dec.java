package ex_07_Increament_Decrement_Operator;

public class Task_26Dec {
    static void main(String[] args) {
        int a = 10;
        a = a++ + a++ + a++;
        System.out.println(a);

        int b = 3;
        int b1 = b++ * ++b;
        System.out.println(b1);

        int c = 5;
        int c1 = c++ + c--;
        System.out.println(c1);
    }
}
