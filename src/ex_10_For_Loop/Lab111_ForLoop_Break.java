package ex_10_For_Loop;

public class Lab111_ForLoop_Break {
    static void main(String[] args) {
        for (int i = 0; i<50;i++){
            System.out.println(i);
            if(i==5){
                System.out.println("Break");
                break;
            }
        }
        System.out.println("End");
    }
}
