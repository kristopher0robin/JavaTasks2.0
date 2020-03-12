package Lesson01_Basics;

import java.util.Arrays;

public class RemoveFromArray {

    public static void main(String[] args) {
        int[] test_arr = {0,1,2,2,3,0,4,2};
        System.out.print(
            Arrays.toString(removeElement(test_arr, 3))
        );
    }
    public static int[] removeElement(int[] nums, int val) {
        int offset = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == val) {
                offset++;
            } else {
                nums[i - offset] = nums[i];
            }
        }
        return Arrays.copyOf(nums, nums.length - offset);
    }

}
