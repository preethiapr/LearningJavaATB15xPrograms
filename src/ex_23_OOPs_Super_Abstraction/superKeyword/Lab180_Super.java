package ex_23_OOPs_Super_Abstraction.superKeyword;

public class Lab180_Super {

}
 class BaseClass {
     private String browser;

     public String getBrowser() {
         return browser;
     }

     public void setBrowser(String browser) {
         this.browser = browser;
     }

     BaseClass() {
         System.out.println("DC- Parent");
     }

     BaseClass(String browser) {
         this.browser = browser;
         System.out.println("DC- Parent");
     }
 }

    class TestCase extends BaseClass{
         void test(){}

             TestCase(){
                 super("Chrome");
                 //super.openBrowser("Chrome");
                 //super.closeBrowser();
             }
         }

