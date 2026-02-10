package ex_14_Strings;

public class Lab135_Strings_Immutable {
    static void main(String[] args) {
        String name = "Preethi";
        name = name.toUpperCase();
        System.out.println(name);

        String s1 = "Hello";
        String s3 = "Hello";
        String s2 = new String("Hello");
    }
}
