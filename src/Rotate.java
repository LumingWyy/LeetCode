/*LeetCode
day4 #189
Rotate Array
Rotate an array of n elements to the right by k steps.

        For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

        Note:
        Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
*/


import java.util.Arrays;

public class Rotate {
    public static void main(String[] args) {
        int num[] = {1, 2};
        int target = 1;
        Solution.rotate(num, target);
        System.out.println(Arrays.toString(num));
    }

    //1
    static class Solution {
        static public void rotate(int[] nums, int k) {
            int len = nums.length;
            if (k > len)
                k = k - len;
            int frontSize = len - k;
            int backSize = len - frontSize;
            if (nums == null || len == 0)
                System.out.println("invalid array");
            int[] front = new int[frontSize];
            int[] back = new int[backSize];
            for (int i = 0; i < frontSize; i++) {
                front[i] = nums[i];
            }
            for (int i = 0; i < backSize; i++) {
                back[i] = nums[frontSize + i];
            }
            System.arraycopy(back, 0, nums, 0, backSize);
            System.arraycopy(front, 0, nums, backSize, frontSize);

        }
    }

    /*
    2
    public class Solution {
        public void rotate(int[] nums, int k) {
            if(nums == null || nums.length < 2){
                return;
            }
            k = k % nums.length;
            reverse(nums, 0, nums.length-1);
            reverse(nums, 0, k-1);
            reverse(nums, k, nums.length-1);
        }

        private void reverse(int[] nums, int i, int j){
            while(i<j){
                swap(nums, i, j);
                i++;
                j--;
            }
        }

        private void swap(int[] nums, int i, int j){
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
    }

    3
    public void rotate(int[] nums, int k) {
	int L=nums.length, counter=0, currentLoc=0, starti=0, prevVal=nums[currentLoc];
	k = k%L;
	while(counter++<L) {
		if(currentLoc>=L && currentLoc%L==starti) { // this handles the case when currentLoc moves back to where started.
		    currentLoc = ++starti;
		    prevVal=nums[currentLoc];
		}

		int nextLoc = (currentLoc+k)%L; // get index of next location
		int nextVal = nums[nextLoc]; // get value at next location
		nums[nextLoc] = prevVal; // update value at next location
		prevVal = nextVal; // update previous value

		currentLoc += k; // move current to next location
	}
}
*/
}
