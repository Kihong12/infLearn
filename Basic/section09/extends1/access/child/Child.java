package com.kihongkim.section09.extends1.access.child;

import com.kihongkim.section09.extends1.access.parent.Parent;

public class Child extends Parent {

    public void call() {
        publicValue = 1;
        protectedValue = 1;
        //defaultValue = 1;
        //privateValue = 1;

        publicMehtod();
        protectedMethod();
        //defaultMethod();
        //privateMethod();

        printParent();
    }
}
