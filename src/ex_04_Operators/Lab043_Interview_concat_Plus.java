package ex_04_Operators;

public class Lab043_Interview_concat_Plus {
    static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a+b);

        String first_name = "Preethi";
        String last_name = "Jayanna";

        System.out.println(a+b+first_name+last_name);
        System.out.println(first_name+last_name+a+b);
        System.out.println(first_name+last_name+(a+b));
    }
}
