package com.kihongkim.Mid1.section01.lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {
    public static void main(String[] args) throws Exception {
        Class clazz = String.class;
//        Class clazz = new String().getClass();
//        Class clazz = Class.forName("java.lang.String");

        Field[] fileds = clazz.getDeclaredFields();
        for (Field filed : fileds) {
            System.out.println("field = " + filed.getType() + " " + filed.getName());
        }

        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println("method = " + method);
        }

        System.out.println("Superclass: " + clazz.getSuperclass().getName());

        Class[] interfaces = clazz.getInterfaces();
        for (Class i : interfaces) {
            System.out.println("Interface: = " + i.getName());
        }
    }
}
