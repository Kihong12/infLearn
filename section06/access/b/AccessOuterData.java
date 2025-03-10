package com.kihongkim.section06.access.b;

import com.kihongkim.section06.access.a.AccessData;

public class AccessOuterData {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        data.publicField = 1;
        data.publicMethod();

        //data.defaultFiled = 2;
        //data.defaultMethod();

        //data.privateFiled = 3;
        //data.privateMethod();

        data.innerAccess();
    }

}
