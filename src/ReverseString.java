/*LeetCode
day11 #344.
        Reverse String
        Write a function that takes a string as input and returns the string reversed.*/


public class ReverseString {
    public static void main(String[] args) {
        String str = "hello";
        String reverse = Solution.reverseString(str);
        System.out.println(reverse);
    }

    static class Solution {
        static String reverseString(String st) {
            String str = new StringBuffer(st).reverse().toString();
            return str;
        }
    }

}
/*
public class Solution {
    public String reverseString(String s) {
        char[] a=s.toCharArray();
        int n=s.length();
        for(int i=0;i<(n/2);i++){
            char temp=a[i];
            a[i]=a[n-i-1];
            a[n-i-1]=temp;
        }
        s=new String(a);
        return s;
    }*/

/*
public class Solution {
    public String reverseString(String s) {
        int length = s.length();
        if (length <= 1) return s;
        String leftStr = s.substring(0, length / 2);
        String rightStr = s.substring(length / 2, length);
        return reverseString(rightStr) + reverseString(leftStr);
    }
}
    }    }*/
