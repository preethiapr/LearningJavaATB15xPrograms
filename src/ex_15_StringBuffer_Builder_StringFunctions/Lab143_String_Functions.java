package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab143_String_Functions {
    static void main(String[] args) {

        String name = "Sonal";
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        System.out.println(name.concat(" shetty"));
        System.out.println(name.contains("om"));
        System.out.println(name.equals("sonal"));
        System.out.println(name.equalsIgnoreCase("sonal"));
        System.out.println(name.indexOf("o"));
        System.out.println(name.indexOf('o'));

        String s1 = "madam";
        System.out.println(s1.indexOf('m'));
        System.out.println(s1.length());
        System.out.println(s1.replace('m','M'));
        System.out.println(name.substring(1,3));
        System.out.println("SONAL".toLowerCase());
        System.out.println("sonal".toUpperCase());
        System.out.println(name.startsWith("S"));
        System.out.println(name.endsWith("a"));
         String name1 = "   Sonal Harish   ";//to remove the spaces

        System.out.println(name1.trim());
        System.out.println(name.compareTo("Sonal"));

        StringBuilder stringBuilder = new StringBuilder("Sonal");
        stringBuilder.reverse();
        System.out.println(stringBuilder);

        StringBuilder sb = new StringBuilder("Hi");
        System.out.println(sb.toString());


    }
}
