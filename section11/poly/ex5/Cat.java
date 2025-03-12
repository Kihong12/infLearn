package com.kihongkim.section11.poly.ex5;

public class Cat implements InterFaceAnimal {
    @Override
    public void sound() {
        System.out.println("냐옹");
    }

    @Override
    public void move() {
        System.out.println("고양이 이동");
    }
}
