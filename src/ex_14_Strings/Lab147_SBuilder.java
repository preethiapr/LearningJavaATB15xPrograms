package ex_14_Strings;

public class Lab147_SBuilder {
    static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.reverse();
        System.out.println(sb);
    }
}
