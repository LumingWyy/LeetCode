/*leetcode
day29 #53.
        Maximum Subarray
        Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
        Example:
        Input: [-2,1,-3,4,-1,2,1,-5,4],
        Output: 6
        Explanation: [4,-1,2,1] has the largest sum = 6.*/
public class MaxSunArray {
    public static void main(String[] args) {
        int[] input = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(Solution.maxSubArray(input));
    }

    public static class Solution {
        public static int maxSubArray(int[] A) {
            int max = Integer.MIN_VALUE, sum = 0;
            for (int i = 0; i < A.length; i++) {
                if (sum < 0)
                    sum = A[i];
                else
                    sum += A[i];
                if (sum > max)
                    max = sum;
            }
            return max;
        }
    }
}
/*

    public int maxSubArray(int[] nums) {

        int maxSoFar=nums[0], maxEndingHere=nums[0];
        for (int i=1;i<nums.length;++i){
            maxEndingHere= Math.max(maxEndingHere+nums[i],nums[i]);
            maxSoFar=Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }*/
