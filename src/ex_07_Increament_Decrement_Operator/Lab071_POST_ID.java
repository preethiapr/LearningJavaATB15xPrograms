package ex_07_Increament_Decrement_Operator;

public class Lab071_POST_ID {
    static void main(String[] args) {
        int a = 10;
        System.out.println(++a);
        int a_post = 10;
        int b = a_post++;
        System.out.println(a_post);
        System.out.println(b);
    }
}
