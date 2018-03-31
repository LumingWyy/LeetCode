/*LeetCode
day13 #387.
First Unique Character in a String
        Given a string, find the first non-repeating character in it and return it's index.
        If it doesn't exist, return -1.
*/
public class FirstUniqChar {
    public static void main(String[] args) {
        String str = "leetleetcode";
        int index = Solution.firstUniqChar(str);
        System.out.println(index);
    }

    static class Solution {
        public static int firstUniqChar(String s) {
            if (s.length() == 1) {
                return 0;
            }
            int index = -1;
            for (int i = 0; i < s.length(); i++) {
                boolean flag = true;
                for (int j = 0; j < s.length(); j++) {
                    if (i == j) {
                        continue;
                    } else {
                        if (s.charAt(i) == s.charAt(j)) {
                            flag = false;
                            break;
                        }
                    }
                }
                if (flag == true) {
                    index = i;
                    break;
                }
            }
            return index;
        }
    }
}
/*better way
    Get the frequency of each character.
    Get the first character that has a frequency of one.

public class Solution {
    public int firstUniqChar(String s) {
        int freq [] = new int[26];
        for(int i = 0; i < s.length(); i ++)
            freq [s.charAt(i) - 'a'] ++;
        for(int i = 0; i < s.length(); i ++)
            if(freq [s.charAt(i) - 'a'] == 1)
                return i;
        return -1;
    }
}*/
