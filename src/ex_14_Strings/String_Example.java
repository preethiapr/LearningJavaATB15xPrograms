package ex_14_Strings;

public class String_Example {
    static void main(String[] args) {
        String s1 = "Preethi";
        String reverse = "";
        for(int i = 0; i<s1.length(); i++){
            reverse = s1.charAt(i)+reverse;
        }
        System.out.println(reverse);
    }
}
