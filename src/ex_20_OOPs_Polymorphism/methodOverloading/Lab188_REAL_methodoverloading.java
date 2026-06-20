package ex_20_OOPs_Polymorphism.methodOverloading;

public class Lab188_REAL_methodoverloading {
    static void main(String[] args) {
        WebAutomation w1 = new WebAutomation();
        w1.openBrowser();
        w1.openBrowser("Firefox");
    }

}

class WebAutomation{
    void openBrowser(){
        System.out.println("Default Browser!!");
    }

    void openBrowser(String browser){
        System.out.println("Starting Browser!!" +browser);
    }

}
