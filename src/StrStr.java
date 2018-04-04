/* LeetCode
day17 #28
       Implement strStr().
        Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
        Example 1:
        Input: haystack = "hello", needle = "ll"
        Output: 2
        Example 2:
        Input: haystack = "aaaaa", needle = "bba"
        Output: -1*/


public class StrStr {
    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "pi";
        System.out.println(Solution.strStr(haystack, needle));
    }

    static class Solution {
        public static int strStr(String haystack, String needle) {
            int hSize = haystack.length();
            int nSize = needle.length();
            if (nSize > hSize) {
                return -1;
            } else if (nSize == 0) {
                return 0;
            }
            for (int i = 0; i <= (hSize - nSize); ++i) {
                int j = 0;
                for (j = 0; j < nSize; ++j) {
                    if (needle.charAt(j) != haystack.charAt(i + j)) {
                        break;
                    }
                }
                if (j == nSize) {
                    return i;
                }
            }
            return -1;
        }
    }
}


/*kmp algorithm

public class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0){
            return 0;
        }
        int[] next = new int[needle.length()];
        // 得到next数组
        getNextArr(next, needle);
        // i是匹配串haystack的指针，j是模式串needle的指针
        int i = 0, j = 0;
        // 双指针开始匹配
        while(i < haystack.length() && j < needle.length()){
            // 如果j=-1意味着刚刚失配过，下标+1后，下一轮就可以开始匹配各自的第一个了
            // 如果指向的字母相同，则下一轮匹配各自的下一个
            if(j == -1 || haystack.charAt(i) == needle.charAt(j)){
                i++;
                j++;
                // 如果失配，则将更新j为next[j]
            } else {
                j = next[j];
            }
        }
        return j == needle.length() ? i - j : -1;
    }

    private void getNextArr(int[] next, String needle){
        // k是前缀中相同部分的末尾，同时也是相同部分的长度，因为长度等于k-0。
        // j是后缀的末尾，即后缀相同部分的末尾
        int k = -1, j = 0;
        next[0] = -1;
        while(j < needle.length() - 1){
            // 如果k=-1，说明刚刚失配了，则重新开始计算前缀和后缀相同的长度
            // 如果两个字符相等，则在上次前缀和后缀相同的长度加1就行了
            if (k == -1 || needle.charAt(j) == needle.charAt(k)){
                k++;
                j++;
                next[j] = k;
            } else {
                // 否则，前缀长度缩短为next[k]
                k = next[k];
            }
        }
    }
}*/

/*
    public int strStr(String haystack, String needle) {
        for (int i = 0; ; i++) {
            for (int j = 0; ; j++) {
                if (j == needle.length()) return i;
                if (i + j == haystack.length()) return -1;
                if (needle.charAt(j) != haystack.charAt(i + j)) break;
            }
        }
    }
*/

