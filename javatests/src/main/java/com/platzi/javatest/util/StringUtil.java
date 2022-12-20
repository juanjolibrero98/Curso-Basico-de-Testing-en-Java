package com.platzi.javatest.util;

public class StringUtil {

    public static String repeat(String str, int times) {
        if(times < 0) {
            throw new IllegalArgumentException("negative times not allowed");
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(str);
        }
        return String.valueOf(sb);
    }

    public static boolean isEmpty(String str) {
        return str == null || str.trim().length() == 0;
    }
}
