package ex_20_OOPs_Polymorphism.methodOverloading;

public class Lab187_Poly_methodOverloading {
    static void main(String[] args) {
        MathOperations math = new MathOperations();
        int s1 = math.add(3,4);
        int s2 = math.add(4,6,8);
        double b1 = math.add(2,4,9);
        String s3 = math.add("Preethi", "priya", "Pinks");
    }

}
class MathOperations{
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    double add(double a, double b, double c){
        return a+b+c;
    }
    String add(String a, String b, String c){
        return a+b+c;
    }
}