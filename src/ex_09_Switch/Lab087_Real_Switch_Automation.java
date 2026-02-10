package ex_09_Switch;

import java.util.Locale;
import java.util.Scanner;

public class Lab087_Real_Switch_Automation {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Browser name");
        String browser = scanner.next();
        browser = browser.toLowerCase();

        switch (browser){
            case "chrome":
                System.out.println("Starting the Chrome browser");
                System.out.println(".........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "firefox":
                System.out.println("Starting the Firefox browser");
                System.out.println(".........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "edge":
                System.out.println("Starting the Edge browser");
                System.out.println(".........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "ie":
                System.out.println("Starting the IE browser");
                System.out.println(".........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            default:
                System.out.println("I have no idea which browser is this");
        }

    }
}
