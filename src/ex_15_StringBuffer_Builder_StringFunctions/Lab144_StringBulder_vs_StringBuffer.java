package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab144_StringBulder_vs_StringBuffer {
    static void main(String[] args) {
        String s1 = "Preethi";
        String s2 = new String("Preethi");

        StringBuilder sb = new StringBuilder("Preethi");
        StringBuffer sb1 = new StringBuffer("Preethi");
        System.out.println(sb.reverse());
        System.out.println(sb1.reverse());
    }
}
