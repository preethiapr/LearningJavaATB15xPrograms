package ex_14_Strings;

public class LabString_Examples1 {
    static void main(String[] args) {
        String s = "Java";
        char c = s.charAt(2);
        System.out.println(c);

        int result = "ABC".compareTo("abc");
        int resut1 = "abc".compareTo("ABCD");
        int result2 = "abc".compareTo("ABC");
        System.out.println(result);
        System.out.println(resut1);
        System.out.println(result2);

    }
}
