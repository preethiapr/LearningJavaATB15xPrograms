package ex_05_TypeCasting;

public class Lab061_Etra_Example_Char {
    static void main(String[] args) {
        char ch = 'A';
        int ascii = ch;

        int num = 66;
        char letter = (char) num;
        System.out.println(letter);
    }
}
