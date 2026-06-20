package ex_16_Arrays;

import java.util.Arrays;

public class Lab157_Interview_second_high_number_Array {
    static void main(String[] args) {
         int[] array = {23, 56, 76, 65,98};
        Arrays.sort(array);
        System.out.println(array[array.length-2]);
    }
}
