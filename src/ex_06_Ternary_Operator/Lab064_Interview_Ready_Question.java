package ex_06_Ternary_Operator;

public class Lab064_Interview_Ready_Question {
    static void main(String[] args) {
        int amol_age = 21;
        String result = (amol_age > 18)? (amol_age > 25 ? "You can drink" : "You can't drink" ): "No You can't go to Goa";
        System.out.println(result);
    }
}
