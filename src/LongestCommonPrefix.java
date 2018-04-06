/*LeetCode
day19 #14.
Longest Common Prefix
        Write a function to find the longest common prefix string amongst an array of strings.*/

import java.util.Collections;
import java.util.LinkedList;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] input = new String[]{"strstrst", "strstrstiii", "strstri", "strstlll", "strsrrr", "strst"};
        String[] in = new String[]{"a", "a"};
        System.out.println(Solution.longestCommonPrefix(in));
    }

    static class Solution {
        public static String longestCommonPrefix(String[] strs) {
            String common = "";
            if (strs.length == 0) {
                return "";
            } else if (strs.length == 1) {
                return strs[0];
            }
            for (int i = 0; i < strs.length; i++) {
                for (int j = 0; j < strs.length; j++) {
                    if (strs[i].length() < strs[j].length()) {
                        String tem = strs[i];
                        strs[i] = strs[j];
                        strs[j] = tem;
                    }
                }
            }
            LinkedList<String> list = new LinkedList<String>();
            for (int i = 1; i < strs.length; i++) {
                int j = 0;
                for (j = 0; j < strs[0].length(); j++) {
                    if (strs[0].charAt(j) != strs[i].charAt(j)) {
                        break;
                    } else {
                        common += strs[0].charAt(j);
                    }
                }
                if (j == 0) {
                    break;
                }
                list.add(common);
                common = "";
            }
            for (int i = 0; i < list.size(); i++) {
                for (int j = 0; j < list.size(); j++) {
                    if (list.get(i).length() < list.get(j).length()) {
                        Collections.swap(list, i, j);
                    }
                }
            }
            if (list.size() == 0 || list.size() + 1 != strs.length) {
                return "";
            } else {
                return list.get(0);
            }

        }
    }
}



 /*   public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String pre = strs[0];
        for (int i = 1; i < strs.length; i++)
            while(strs[i].indexOf(pre) != 0)
                pre = pre.substring(0,pre.length()-1);
        return pre;
    }*/

   /* public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();

        if (strs!= null && strs.length > 0){

            Arrays.sort(strs);

            char [] a = strs[0].toCharArray();
            char [] b = strs[strs.length-1].toCharArray();

            for (int i = 0; i < a.length; i ++){
                if (b.length > i && b[i] == a[i]){
                    result.append(b[i]);
                }
                else {
                    return result.toString();
                }
            }
            return result.toString();
        }*/