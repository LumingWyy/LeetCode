/*LeetCode
#day2   Remove Duplicates from Sorted Array
Given a sorted array, remove the duplicates in-place such that each element appear only once and return the new length.
Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

        Example:
        Given nums = [1,1,2],
        Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
        It doesn't matter what you leave beyond the new length.
*/


public class RemoveDuplicates {

    public static void main(String[] args) {
        int nums[] = {1, 1, 2};
        int result;
        result = Solution.removeDuplicates(nums);
        System.out.println(result);
    }

    static class Solution {
        static int removeDuplicates(int[] nums) {
            if (nums == null || nums.length == 0) {
                return 0;
            }
            int duplicate = nums[0];
            int end = 1;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != duplicate) {
                    nums[end] = nums[i];
                    duplicate = nums[i];
                    end++;
                }

            }
            return end;
        }

/* other
        public static int removeDuplicatesNaive(int[] A) {
            if (A.length < 2)
                return A.length;
            int j = 0;
            int i = 1;
            while (i < A.length) {
                if (A[i] == A[j]) {
                    i++;
                } else {
                    j++;
                    A[j] = A[i];
                    i++;
                }
            }
            return j + 1;
        }*/
    }

}
