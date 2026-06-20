package ex_20_OOPs_Polymorphism.methodOverriding;

public class Lab189_MOverriding {
    static void main(String[] args) {
        Preethi p1 = new Preethi();
        p1.home();

        Father f1 = new Father();
        f1.home();

        Father f2 = new Preethi();
        f2.home();
    }
}

class Father{
    void home(){
        System.out.println("2BHK");
    }
}
 class Preethi extends Father{
    @Override
     void home() {
         System.out.println("3BHK");
     }
 }