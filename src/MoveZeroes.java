/*

LeetCode
        day8 #283
        Move Zeroes
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

        For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

        Note:

        You must do this in-place without making a copy of the array.
        Minimize the total number of operations.
*/


import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] input = {3, 0, 6, 0, 1, 0, 4, 4, 0, 2, 0, 8};

        int[] input1 = {3, 0, 0, 6};
        Solution.moveZeroes(input);
        Solution.moveZeroes(input1);
        System.out.println(Arrays.toString(input));
        System.out.println(Arrays.toString(input1));
    }

    static class Solution {
        public static void moveZeroes(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    for (int j = i + 1; j < nums.length; j++) {
                        if (nums[j] != 0) {
                            int tem = nums[i];
                            nums[i] = nums[j];
                            nums[j] = tem;
                            break;
                        }
                    }
                }
            }
        }
/* Shift non-zero values as far forward as possible
 Fill remaining space with zeros

        public void moveZeroes(int[] nums) {
            if (nums == null || nums.length == 0) return;

            int insertPos = 0;
            for (int num: nums) {
                if (num != 0) nums[insertPos++] = num;
            }

            while (insertPos < nums.length) {
                nums[insertPos++] = 0;
            }
        }*/
    }


}
