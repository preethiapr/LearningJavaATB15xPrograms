package ex_22_OOPs_Encp_AccessModifier.police;

public class Rahul extends Cop {

    public Rahul(int bullet){
        super(bullet);
    }

    public static void main(String[] args) {
        Cop rahul = new Cop(100);
        rahul.canIShoot();
        rahul.thisDefaultF1();

    }
}
