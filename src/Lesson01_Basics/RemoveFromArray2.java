package Lesson01_Basics;

import java.util.Arrays;

public class RemoveFromArray2 {

    // Можно написать метод для «отрезания хвоста» массива и самостоятельно,
    // но стоит отметить, что стандартный метод будет работать быстрее

    public static void main(String[] args) {
        int[] test_arr = {0,1,2,2,3,0,4,2};
        System.out.print(
                Arrays.toString(removeElement(test_arr, 3))
        );
    }

    public static int[] removeElement(int[] nums, int val) {
        int offset = 0;

        for(int i=0; i < nums.length; i++) {
            if(nums[i] == val) {
                offset++;
            } else {
                nums[i-offset] = nums[i];
            }
        }

        int[] newArr = new int[nums.length - offset];
        for(int i=0; i < newArr.length; i++) {
            newArr[i] = nums[i];
        }
        return newArr;
    }

}
