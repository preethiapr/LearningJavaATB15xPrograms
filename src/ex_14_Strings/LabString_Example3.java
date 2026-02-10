package ex_14_Strings;

public class LabString_Example3 {
    static void main(String[] args) {
        String s = "Java".substring(2);
        String s1 = "Java".substring(0);
        System.out.println(s);
        System.out.println(s1);

        char[] arr = "Java".toCharArray();
        System.out.println(arr);

        boolean b = "  ".isBlank();
        System.out.println(b);

        String s2 = "ab".repeat(3);
        System.out.println(s2);

        boolean b2 = "Java".equalsIgnoreCase("java");
        System.out.println(b2);

        long l1 = "a\nb\nc".lines().count();
        System.out.println(l1);

        boolean b3 = "".isEmpty();
        System.out.println(b3);
    }
}
