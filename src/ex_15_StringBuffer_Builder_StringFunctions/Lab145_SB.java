package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab145_SB {
    static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Preethi");
        stringBuffer.append(" Jayanna");
        System.out.println(stringBuffer);

        String s1 = "Preethi";
        s1 = s1 + " Jayanna";
        System.out.println(s1);
    }
}
