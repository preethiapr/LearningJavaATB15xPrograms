package ex_09_Switch;

public class Lab094_JDK13 {
    static void main(String[] args) {
        int itemcode = 006;
        switch (itemcode){
            case 002,001,005:
                System.out.println("All of the items are Electronics gadgets");
                break;
            case 003,004,006:
                System.out.println("All of the items are Mechanical");
                break;
            case 000,007:
                System.out.println("All of the items are kitchen");
                break;
            default:
                System.out.println("None");
        }
    }
}
