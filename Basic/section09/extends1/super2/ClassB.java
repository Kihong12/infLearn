package com.kihongkim.section09.extends1.super2;

public class ClassB extends ClassA {
    public ClassB(int a) {
        this(a, 0);
        System.out.println("ClassB 생성자 a="+a);
    }

    public ClassB(int a, int b) {
        super();
        System.out.println("ClassB 생성자 a=" + a + " b=" + b);
    }
}
