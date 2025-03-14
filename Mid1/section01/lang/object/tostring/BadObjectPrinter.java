package com.kihongkim.Mid1.section01.lang.object.tostring;

public class BadObjectPrinter {
    public static void print(Car car) {
        String string = "객체 정보 출력: " + car.carInfo();
        System.out.println(string);
    }

    public static void print(Dog dog) {
        String string = "객체 정보 출력: " + dog.dogInfo();
        System.out.println(string);
    }
}
