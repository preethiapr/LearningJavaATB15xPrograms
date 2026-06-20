package ex_19_OOPs_Part2.OOPs_01_inheritance_singleinheritance;

public class Lab168_SI {
    static void main(String[] args) {
        Son pram = new Son();
        System.out.println(pram.gold_f);
        pram.BHK3();
        pram.BHK2();

        Father f1 = new Father();
        System.out.println(f1.gold_f);
        f1.BHK2();

    }
}
