import java.util.Arrays;
/*LeetCode
day35 #88
 Merge Sorted Array
        Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
        Note:
        The number of elements initialized in nums1 and nums2 are m and n respectively.
        You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
        Example:
        Input:
        nums1 = [1,2,3,0,0,0], m = 3
        nums2 = [2,5,6],       n = 3
        Output: [1,2,2,3,5,6]
*/


public class MergeArrays {
    public static void main(String[] args) {
        int[] input1 = {1, 2, 3, 0, 0, 0};
        int[] input2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        Solution.merge(input1, m, input2, n);
        System.out.println(Arrays.toString(input1));
    }

    static class Solution {
        public static void merge(int A[], int m, int B[], int n) {
            for (int i = m + n - 1; i >= 0; i--) {
                if (m > 0 && n > 0) {
                    if (B[n - 1] > A[m - 1]) {
                        A[i] = B[n - 1];
                        n--;
                    } else {
                        A[i] = A[m - 1];
                        m--;
                    }
                } else if (m > 0) {
                    A[i] = A[m - 1];
                    m--;
                } else if (n > 0) {
                    A[i] = B[n - 1];
                    n--;
                }
            }

        }
    }
}
