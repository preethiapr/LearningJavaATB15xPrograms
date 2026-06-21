package ex_23_OOPs_Super_Abstraction.abstraction;

public class Lab187_Interface_P1 {
    public static void main(String[] args) {
        Car2 car2 = new Car2();
        car2.drive();
    }
}

class Car2 implements Breaks, Engine1{
    void drive(){
        applyBreaks();
        startEngine();
        stopEngine();
        testEngine();
        Engine1.testEngineStatic();
    }
    @Override
    public void applyBreaks() {
        System.out.println("applyBreaks");
    }

    @Override
    public void startEngine() {
        System.out.println("startEngine");
    }

    @Override
    public void stopEngine() {
        System.out.println("stopEngine");
    }
}
interface Breaks {
    void applyBreaks();
}

interface Engine1{
    void startEngine();
    void stopEngine();

    default void testEngine(){
        System.out.println("Concrete Complete");
    }
    static void testEngineStatic(){
        System.out.println("Concrete Complete");
    }
}