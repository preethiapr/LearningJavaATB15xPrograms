package ex_05_TypeCasting;

public class Lab061_TypeCasting_Used {
    static void main(String[] args) {
        int course = 100;
        float NSRT_GST = 18.45f;
        int total = course+(int) NSRT_GST;
        float total2 = course+NSRT_GST;
        System.out.println(total2);
    }
}
