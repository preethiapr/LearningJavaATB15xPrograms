package ex_05_TypeCasting;

public class Lab059_TypeCasting_Narrowing {
    static void main(String[] args) {
        int val = 300;
        byte b =(byte) val;
        System.out.println(b);
        int s = 3;
        byte b2 = (byte) s;
        System.out.println(b2);
    }
}
