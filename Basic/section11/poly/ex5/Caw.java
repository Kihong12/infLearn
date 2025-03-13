package com.kihongkim.section11.poly.ex5;

public class Caw implements InterFaceAnimal {
    @Override
    public void sound() {
        System.out.println("음매");
    }

    @Override
    public void move() {
        System.out.println("소 이동");
    }
}
