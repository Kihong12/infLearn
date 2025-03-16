package com.kihongkim.Mid1.section01.lang.string.method;

public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        String numString = String.valueOf(num);
        System.out.println("숫자의 문자열 값: " + numString);
        String booString = String.valueOf(bool);
        System.out.println("불리언의 문자열 값: " + booString);
        String objString = String.valueOf(obj);
        System.out.println("객체의 문자열 값: " + objString);

        String numString2 = "" + num;
        System.out.println("빈문자열 + num:" + numString2);

        char[] strCharArray = str.toCharArray();
        System.out.println("문자열을 문자 배열로 반환: " + strCharArray);
        for (char c : strCharArray) {
            System.out.print(c);
        }
        System.out.println();
    }
}
