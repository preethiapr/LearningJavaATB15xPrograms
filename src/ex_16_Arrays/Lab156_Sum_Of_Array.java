package ex_16_Arrays;

public class Lab156_Sum_Of_Array {
    static void main(String[] args) {

        int[] marks = {67, 87, 98,89, 78, 96};
        int sum = 0;

        for(int i = 0; i <= marks.length-1; i++){
            sum = sum + marks[i];
        }

        System.out.println(sum);
    }
}
