package com.kihongkim.Mid1.section01.lang.string.test;

public class TestString11 {

    public static void main(String[] args) {
        String str = "Hello Java";

        String sb = new StringBuilder(str).reverse().toString();
        System.out.println(sb);
    }
}
