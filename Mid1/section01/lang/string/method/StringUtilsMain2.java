package com.kihongkim.Mid1.section01.lang.string.method;

public class StringUtilsMain2 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        String str = "Hello, Java!";

        String format1 = String.format("num: %d, bool: %b, str: %s", num, bool, str);
        System.out.println(format1);

        String format2 = String.format("숫자: %.2f", 10.1234);
        System.out.println(format2);

        System.out.printf("숫자: %.2f\n", 10.1234);

        String regex = "Hello, (Java!|World!)";
        System.out.println("'str'이 이 패턴과 일치하는가? " + str.matches(regex));
    }
}
