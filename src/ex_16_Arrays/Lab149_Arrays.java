package ex_16_Arrays;

public class Lab149_Arrays {
    static void main(String[] args) {
        int a = 10;
        int[] marks = {91, 92, 93, 95, 96, 97};
        int marks1[]= {34, 45, 56, 67, 78, 98, 90};

        boolean[] better_result = {true, false, true, false};
        String names[] = {"Preethi", "Nihant", "Vishu", "Hani"};

        float f[] = new float[4];
        f[0] = 3.0f;
        f[1] = 4.2f;
        f[2] = 5.4f;
        f[3] = 6.7f;

        for (float f1 : f){
            System.out.println(f1);
        }

    }
}
