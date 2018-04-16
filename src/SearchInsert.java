
/*LeetCode
day28 #35. Search Insert Position
        Given a sorted array and a target value, return the index if the target is found.
        If not, return the index where it would be if it were inserted in order.
        You may assume no duplicates in the array.
        Example 1:
        Input: [1,3,5,6], 5
        Output: 2*/


import java.util.Arrays;

public class SearchInsert {
    public static void main(String[] args) {
        int[] input = {1, 3, 5, 6};
        int target = 7;
        System.out.println(Solution.searchInsert(input, target));
    }

    static class Solution {
        public static int searchInsert(int[] nums, int target) {
            int index = Arrays.binarySearch(nums, target);
            if (index >= 0) {
                return index;
            } else {
                if (target > nums[nums.length - 1]) {
                    return nums.length;
                } else if (target < nums[0]) {
                    return 0;
                }
                for (int i = 1; i < nums.length; i++) {
                    if (nums[i - 1] < target && target < nums[i]) {
                        return i;
                    }
                }
                return -1;
            }
        }
    }
}