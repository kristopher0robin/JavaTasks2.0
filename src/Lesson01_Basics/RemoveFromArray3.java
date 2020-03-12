package Lesson01_Basics;

import java.util.Arrays;

public class RemoveFromArray3 {

    // Впрочем, если идти таким путём, то можно сначала создать массив нужной длины, а потом уже заполнить его

    public static void main(String[] args) {
        int[] test_arr = {0,1,2,2,3,0,4,2};
        System.out.print(
                Arrays.toString(removeElement(test_arr, 3))
        );
    }

    public static int[] removeElement(int[] nums, int val) {
        int count = 0;

        // Сначала вычислим длину нового массива
        for(int i=0; i < nums.length; i++) {
            if (nums[i] != val) {
                count++;
            }
        }

        int[] newArr = new int[count];
        int offset = 0;

        // Далее все как в прошлых решениях, но запись идет в новый массив
        for(int i=0; i < nums.length; i++) {
            if (nums[i] == val) {
                offset++;
            } else {
                newArr[i-offset] = nums[i];
            }
        }
        return newArr;
    }

}
