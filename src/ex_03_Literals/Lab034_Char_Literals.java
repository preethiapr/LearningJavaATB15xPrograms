package ex_03_Literals;

public class Lab034_Char_Literals {
    static void main(String[] args) {
        char c1 = 'A';
        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' ';//blank space

        //Escape Sequences
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';
        System.out.println("PramodDutta");
        System.out.println("Pramod"+new_line+"Dutta");
        System.out.println("Say"+new_line+tab_line+"Hello"+new_line+tab_line+tab_line+"Good"+new_line+tab_line+tab_line+tab_line+"Morning");
        System.out.println("One\n\tTwo\n\t\tThree\n\t\t\tFour");
        System.out.println("Pramod "+back_space+"Dutta");
        System.out.println(" ------- ");
        System.out.println("Pramod"+carriage_return+"Dutta");

        char c10 = 'A';
        char rupees = '$';
        char my_laugh_smily = '\u1f60';
        char c11 = '\u1F60';
        char c20 = 10;

        int binary = 0b1010;
        int hex = 0xFF;
        long amount = 1_00_11_100L;
        System.out.println(amount);
        System.out.println(c20);

    }
}
