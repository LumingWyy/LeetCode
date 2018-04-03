
/*LeetCode
day16 #8
String to Integer
        Implement atoi to convert a string to an integer.
        Notes: It is intended for this problem to be specified vaguely (ie, no given input specs).
        You are responsible to gather all the input requirements up front.*/

public class MyAtoi {
    public static void main(String[] args) {
        String a = "1234567 ";
        System.out.println(Solution.myAtoi(a));
    }


    static class Solution {
        public static int myAtoi(String str) {
            if (str == null || str.length() == 0)
                return 0;
            str = str.trim();
            char firstChar = str.charAt(0);
            int sign = 1, start = 0, len = str.length();
            long sum = 0;
            if (firstChar == '+') {
                sign = 1;
                start++;
            } else if (firstChar == '-') {
                sign = -1;
                start++;
            }
            for (int i = start; i < len; i++) {
                if (!Character.isDigit(str.charAt(i)))
                    return (int) sum * sign;
                sum = sum * 10 + str.charAt(i) - '0';
                if (sign == 1 && sum > Integer.MAX_VALUE)
                    return Integer.MAX_VALUE;
                if (sign == -1 && (-1) * sum < Integer.MIN_VALUE)
                    return Integer.MIN_VALUE;
            }

            return (int) sum * sign;
        }
        /*public static int myAtoi(String str) {
            // 合法性判断
            if (str.isEmpty()) return 0;
            // 正负号标记
            int sign = 1;
            // 转换值
            int base = 0;
            // 索引位数
            int i = 0;
            // 剔除开始空白字符
            while (str.charAt(i) == ' ')
                i++;
            // 判断正负号
            if (str.charAt(i) == '-' || str.charAt(i) == '+')
                sign = str.charAt(i++) == '-' ? -1 : 1;
            // 索引有效数字字符
            while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                // that statement is used to test if the num is bigger than INT_MAX after the str[i] is handled, if base > INT_MAX/10,
                // then base10+ str[i] -‘0’> base10>INT_MAX, or when base== INT_MAX/10, that means all the places are the same as INT_MAX except the ones place, so str[i]>‘7’ is needed.
                // 上面这段是LeetCode国外站对下面代码的解释。
                // 简单来说就是
                // 如果`base > MAX_VALUE/10`，那么`base*10 + new_value` > `base*10` > `MAX_VALUE`。这个应该很容易理解，这种情况下就会发生溢出。
                // 若`base == INT_MAX/10`，而且`new_value = str.charAt(i++) - '0'`大于`7`，也会发生溢出。因为`MAX_VALUE = 2147483647`
                if (base > Integer.MAX_VALUE / 10 || (base == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > 7)) {
                    return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                // 计算转换值
                base = 10 * base + (str.charAt(i++) - '0');
            }
            // 计算结果值
            return base * sign;
        }*/
    }
}

  /*  int myAtoi(String str) {
        try {
            BigInteger value = new BigInteger(str.replaceFirst("^\\s*([+-]?\\d+).*?$", "$1"));
            return (value.signum() < 0
                    ? value.max(BigInteger.valueOf(Integer.MIN_VALUE)).intValue()
                    : value.min(BigInteger.valueOf(Integer.MAX_VALUE)).intValue();
        } catch (NumberFormatException e) {
            return 0;
        }
    }*/
