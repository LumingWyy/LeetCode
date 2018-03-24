/*LeetCode
        day7 #66
        Plus One

Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.

        You may assume the integer do not contain any leading zero, except the number 0 itself.

        The digits are stored such that the most significant digit is at the head of the list.*/


import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int input[] = {9, 9, 9};
        int output[] = Solution.plusOne(input);
        System.out.println(Arrays.toString(output));
    }

    private static class Solution {
        static int[] plusOne(int[] digits) {
            for (int i = digits.length - 1; i >= 0; i--) {
                if (digits[i] < 9) {
                    digits[i] += 1;
                    break;
                }
                digits[i] = 0;
            }
            if (digits[0] == 0) {
                int[] re = new int[digits.length + 1];
                re[0] = 1;
                System.arraycopy(digits, 0, re, 1, digits.length);
                return re;
            } else {
                return digits;
            }
        }
    }
}
