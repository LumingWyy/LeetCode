import java.util.Arrays;

/*LeetCode
day14 #242
Valid Anagram

        Given two strings s and t, write a function to determine if t is an anagram of s.

        For example,
        s = "anagram", t = "nagaram", return true.
        s = "rat", t = "car", return false.

        Note:
        You may assume the string contains only lowercase alphabets.*/
public class IsAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean result = Solution.isAnagram(t, s);
        System.out.println(result);
    }

    static class Solution {
        public static boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) {
                return false;
            }
            char[] char1 = new char[s.length()];
            char[] char2 = new char[s.length()];

            char1 = s.toCharArray();
            char2 = t.toCharArray();
            Arrays.sort(char1);
            Arrays.sort(char2);
            String string1 = String.valueOf(char1);
            String string2 = String.valueOf(char2);
            if (string1.equals(string2)) {
                return true;
            } else {
                return false;
            }
        }
    }
}
/*
public class Solution {
  public boolean isAnagram(String s, String t) {
      int[] alphabet = new int[26];
      for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
      for (int i = 0; i < t.length(); i++) {
        alphabet[t.charAt(i) - 'a']--;
        if(alphabet[t.charAt(i) - 'a'] < 0) return false;
      }
      for (int i : alphabet) if (i != 0) return false;
      return true;
  }
}
}*/
