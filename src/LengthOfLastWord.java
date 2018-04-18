/*LeetCode
day30 #58. Length of Last Word
        Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
        If the last word does not exist, return 0.
        Note: A word is defined as a character sequence consists of non-space characters only.
        Example:
        Input: "Hello World"
        Output: 5*/

public class LengthOfLastWord {
    public static void main(String[] args) {
        String input = " ";
        System.out.println(Solution.lengthOfLastWord(input));
    }

    static class Solution {
        public static int lengthOfLastWord(String s) {
            String[] str = s.split(" ");
            if (str.length == 0) {
                return 0;
            }
            int len = str[str.length - 1].length();
            System.out.println(str[str.length - 1]);
            return len;
        }
    }
}
/*

    public int lengthOfLastWord(String s) {
        return s.trim().length()-s.trim().lastIndexOf(" ")-1;
    }*/
