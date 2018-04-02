/*
LeetCode
day15 #125.
        Valid Palindrome
        Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

        For example,
        "A man, a plan, a canal: Panama" is a palindrome.
        "race a car" is not a palindrome.*/

public class IsPalindrome {
    public static void main(String[] args) {
        String str = "a..b,,,2a！！？？？？？？，，a2 #ba";
        boolean result = Solution.isPalindrome(str);
        System.out.println(result);
    }

    static class Solution {
        public static boolean isPalindrome(String s) {
            s = s.replaceAll("[\\pP\\p{Punct}]", "");//只留数字字母
            s = s.replaceAll(" ", "");
            boolean result = true;
            if (s.isEmpty()) {
                return true;
            }
            int j = s.length() - 1;
            for (int i = 0; i < s.length(); i++) {
                if (i == j) {
                    break;
                }
                if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                    result = false;
                }
                j--;
            }
            return result;
        }
    }
}
/*2
public class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int head = 0, tail = s.length() - 1;
        char cHead, cTail;
        while(head <= tail) {
            cHead = s.charAt(head);
            cTail = s.charAt(tail);
            if (!Character.isLetterOrDigit(cHead)) {
                head++;
            } else if(!Character.isLetterOrDigit(cTail)) {
                tail--;
            } else {
                if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
                    return false;
                }
                head++;
                tail--;
            }
        }

        return true;
    }
    3
    public class Solution {
    public boolean isPalindrome(String s) {
        String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String rev = new StringBuffer(actual).reverse().toString();
        return actual.equals(rev);
    }
}
}*/
