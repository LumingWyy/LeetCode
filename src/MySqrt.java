/*LeetCode
day32 #69. Sqrt(x)
        Implement int sqrt(int x).
        Compute and return the square root of x, where x is guaranteed to be a non-negative integer.
        Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.
        Example 1:
        Input: 4
        Output: 2*/

public class MySqrt {
    public static void main(String[] args) {
        int a = 4;
        System.out.println(Solution.mySqrt(a));
    }

    static class Solution {
        public static int mySqrt(int x) {
            if (x == 0)
                return 0;
            int left = 1, right = Integer.MAX_VALUE;
            while (true) {
                int mid = left + (right - left) / 2;
                if (mid > x / mid) {
                    right = mid - 1;
                } else {
                    if (mid + 1 > x / (mid + 1))
                        return mid;
                    left = mid + 1;
                }
            }
        }
    }
}
/*
class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        long i = x;
        while(i > x / i)
            i = (i + x / i) / 2;
        return (int)i;
    }
}*/
