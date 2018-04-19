/*LeetCode
day31 #67. Add Binary
        Given two binary strings, return their sum (also a binary string).
        The input strings are both non-empty and contains only characters 1 or 0.
        Example 1:
        Input: a = "11", b = "1"
        Output: "100"*/
public class AddBinary {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(Solution.addBinary(a, b));
    }

    public static class Solution {
        public static String addBinary(String a, String b) {
            if (a == null || a.isEmpty()) {
                return b;
            }
            if (b == null || b.isEmpty()) {
                return a;
            }
            char[] aArray = a.toCharArray();
            char[] bArray = b.toCharArray();
            StringBuilder stb = new StringBuilder();

            int i = aArray.length - 1;
            int j = bArray.length - 1;
            int aByte;
            int bByte;
            int carry = 0;
            int result;

            while (i > -1 || j > -1 || carry == 1) {
                aByte = (i > -1) ? Character.getNumericValue(aArray[i--]) : 0;
                bByte = (j > -1) ? Character.getNumericValue(bArray[j--]) : 0;
                result = aByte ^ bByte ^ carry;
                carry = ((aByte + bByte + carry) >= 2) ? 1 : 0;
                stb.append(result);
            }
            return stb.reverse().toString();
        }
    }
}
