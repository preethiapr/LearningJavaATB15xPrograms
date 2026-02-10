package ex_10_For_Loop;

public class Lab110_Odd_Even_from_Top50 {
    static void main(String[] args) {
        for (int i = 1; i<=50;i++){
            if(i%2==0){
                System.out.println("Even number-> "+i);
            }
            else {
                System.out.println();
            }
        }
    }
}
