
/*LeetCode
day27 #20. Valid Parentheses
        Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
        An input string is valid if:
        Open brackets must be closed by the same type of brackets.
        Open brackets must be closed in the correct order.
        Note that an empty string is also considered valid.*/


import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String str = "{{}[}()]";
        System.out.println(Solution.isValid(str));
    }

    static class Solution {
        public static boolean isValid(String s) {
            HashMap<Character, Character> map = new HashMap<Character, Character>();
            map.put('(', ')');
            map.put('[', ']');
            map.put('{', '}');
            Stack<Character> stack = new Stack<Character>();

            for (int i = 0; i < s.length(); i++) {
                char curr = s.charAt(i);
                if (map.keySet().contains(curr)) {
                    stack.push(curr);
                } else if (map.values().contains(curr)) {
                    if (!stack.isEmpty() && map.get(stack.peek()) == curr) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
            return stack.isEmpty();
        }
    }
}
