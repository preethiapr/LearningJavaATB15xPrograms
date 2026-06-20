package ex_20_OOPs_Polymorphism.methodOverriding;

public class Lab190_MethodOverriding_Automation {
    private static Object c4;

    static void main(String[] args) {
        ChromeTC c2 = new ChromeTC();
        c2.openBrowser();

        FirefoxTC f1 = new FirefoxTC();
        f1.openBrowser();

        CommonToAll c1 = new CommonToAll();
        c1.openBrowser();

        CommonToAll c3 = new ChromeTC();
        c3.openBrowser();

        CommonToAll c4 = new FirefoxTC();
        c4.openBrowser();
    }

}
class CommonToAll{
    void openBrowser(){
        System.out.println("Starting the IE Browser!!");
    }

}

class ChromeTC extends CommonToAll{
    @Override
    void openBrowser(){
        System.out.println("Starting the Chrome Browser!!");
    }

}

class FirefoxTC extends CommonToAll{
    @Override
    void openBrowser(){
        System.out.println("Starting the Firefox Browser!!");
    }

}