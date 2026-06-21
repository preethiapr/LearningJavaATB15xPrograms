package ex_23_OOPs_Super_Abstraction.abstraction;

public class Lab186_Better_Abstract_Class {
    public static void main(String[] args) {
        Alto a1 = new Alto();
        a1.stopCar();
        a1.startCar();
        a1.drive();
    }
}

class Alto extends Car1{
void drive(){
    startCar();
    System.out.println("We are driving a Car!");
    stopCar();
}
    @Override
    void startCar() {
        System.out.println("Starting a Car Alto!!");
    }

    @Override
    void stopCar() {
        System.out.println("Stoping a Car Alto!!");
    }
}






abstract class Car1{
    abstract void startCar();
    abstract void stopCar();
}