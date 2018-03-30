/*LeetCode
day12 #7.
        Reverse Integer
        Given a 32-bit signed integer, reverse digits of an integer.
        Assume we are dealing with an environment which
        could only hold integers within the 32-bit signed integer range.
        For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.*/

public class ReverseInt {

    public static void main(String[] args) {
        int str = 1536469;
        int reverse = Solution.reverseInt(str);
        System.out.println(reverse);
    }

    static class Solution {
        public static int reverseInt(int x) {
            String strX = String.valueOf(x);
            long result;
            if (x > 0) {
                String reX = new StringBuffer(strX).reverse().toString();
                if (reX.charAt(0) == '0') {
                    reX = reX.substring(1, reX.length());
                }
                result = Long.parseLong(reX);
                if (result > Integer.MAX_VALUE) {
                    return 0;
                } else {
                    return (int) result;
                }
            } else {
                String s = strX.substring(1, strX.length());
                String reX = new StringBuffer(s).reverse().toString();
                reX = strX.charAt(0) + reX;
                result = Long.parseLong(reX);
                if (result < Integer.MIN_VALUE) {
                    return 0;
                } else {
                    return (int) result;
                }
            }
        }
    }

}
/*
public class Solution {
    public int reverse(int x) {
        long result = 0;
        int tmp = Math.abs(x);
        while(tmp>0){
            result *= 10;
            result += tmp % 10;
            if(result > Integer.MAX_VALUE){
                return 0;
            }
            tmp /= 10;
        }
        return (int)(x>=0?result:-result);
    }
}*/
