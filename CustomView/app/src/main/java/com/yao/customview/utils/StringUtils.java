package com.yao.customview.utils;

public class StringUtils {
    public static boolean isEmpty(String input) {
        if (input != null && !"".equals(input)) {
            for(int i = 0; i < input.length(); ++i) {
                char c = input.charAt(i);
                if (c != ' ' && c != '\t' && c != '\r' && c != '\n') {
                    return false;
                }
            }
            return true;
        } else {
            return true;
        }
    }

    public static String getNotNullString(String str, String ret) {
        return str == null ? ret : str;
    }

    public static String getNotNullString(String str) {
        return getNotNullString(str, "");
    }

    /**
     * 是否相等
     * 如果两个的值一样, 则返回true
     *
     * @param str1 字符串1
     * @param str2 字符串2
     * @return 如果两个的值一样, 则返回true, 否则返回false.
     */
    public static boolean equalsNotNull(String str1, String str2) {
        return str1 != null && str1.equals(str2);
    }
}
