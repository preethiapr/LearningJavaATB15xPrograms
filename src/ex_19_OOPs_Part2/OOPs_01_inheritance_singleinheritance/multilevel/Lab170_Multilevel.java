package ex_19_OOPs_Part2.OOPs_01_inheritance_singleinheritance.multilevel;

import ex_19_OOPs_Part2.OOPs_01_inheritance_singleinheritance.multilevel.Father;

public class Lab170_Multilevel {
    public static void main(String[] args) {
        Son Prakash = new Son();
        Prakash.bhk3();
        Prakash.home();
        Prakash.gf();
        Prakash.ExtraMoney();

        Father f1 = new Father();
        f1.gf();
        f1.ExtraMoney();
        f1.home();

        GrandFather gf = new GrandFather();
        gf.home();
        gf.gf();

        //Dynamic dispatching

        GrandFather g1 = new Son();
        Father f11 = new Son();
        // Son s1 = new GrandFather():
        // Son s11 = new Father();
    }


}
