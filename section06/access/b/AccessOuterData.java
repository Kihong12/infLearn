package com.kihongkim.section06.access.a;

public class AccessOuterData {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        data.publicField = 1;
        data.publicMethod();
    }
}
