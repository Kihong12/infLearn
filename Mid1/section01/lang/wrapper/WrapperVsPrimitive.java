package com.kihongkim.Mid1.section01.lang.wrapper;

public class WrapperVsPrimitive {

    public static void main(String[] args) {
        int interations = 1_000_000_000;
        long starTime, endTime;

        long sumPrimitive = 0;
        starTime = System.currentTimeMillis();
        for (int i = 0; i < interations; i++) {
            sumPrimitive += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumPrimitive = " + sumPrimitive);
        System.out.println("기본 자료형 long 실행 시간: " + (endTime - starTime) + "ms");

        Long sumWrapper = 0L;
        starTime = System.currentTimeMillis();
        for (int i = 0; i < interations; i++) {
            sumWrapper += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumWrapper = " + sumWrapper);
        System.out.println("래퍼 클래스 Long 실행 시간: " + (endTime - starTime) + "ms");
    }
}
