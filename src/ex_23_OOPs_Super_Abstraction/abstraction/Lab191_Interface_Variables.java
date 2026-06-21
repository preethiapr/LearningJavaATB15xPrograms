package ex_23_OOPs_Super_Abstraction.abstraction;

public class Lab191_Interface_Variables {

}
interface Premod{
    final int a = 10;
    String notes = "JAVA";
    void display();
}

class Dutta implements Premod{
        int aa = 100;
    @Override
    public void display() {
        System.out.println(a);
        System.out.println(this.aa);
    }
}

class Sowmya implements Premod{

    @Override
    public void display() {
        System.out.println(notes);
    }
}