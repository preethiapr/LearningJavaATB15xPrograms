package ex_14_Strings;

public class Lab141_String_Interview_P2 {
    static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";

        String s3 = new String("Hello");
        String s4 = new String("Hello");
        String s5 = new String("hello");

        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1 == s2);
        System.out.println(s3 == s5);

        System.out.println(s1.equals(s3));
        System.out.println(s4.equals(s5));
        System.out.println(s4.equalsIgnoreCase(s5));

    }
}
