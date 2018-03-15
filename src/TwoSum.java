/*LeetCode
 * #day1 Two Sum

Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
Example:
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].*/

public class TwoSum {
    public static void main(String[] args) {
        int nums[] = {2, 7, 11, 15};
        int target = 9;
        int[] re;
        re = Solution.twoSum(nums, target);
        System.out.println(re[0] + "," + re[1]);
    }


    //my way
    public static class Solution {
        public static int[] twoSum(int[] nums, int target) {
            int index[] = new int[2];
            for (int i = 1; i <= nums.length; i++) {
                if (nums.length == i) {
                    break;
                }
                int b = target - nums[nums.length - i];
                for (int j = 0; j < nums.length - i; j++) {
                    if (b == nums[j]) {
                        index[0] = j;
                        index[1] = nums.length - i;
                        break;
                    }
                }
            }
            return index;
        }
    }
}
/*
    better way

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int result[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int num = target - nums[i];
            if (map.containsKey(num)) {
                result[0] = map.get(num);
                result[1] = i;
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}*/
