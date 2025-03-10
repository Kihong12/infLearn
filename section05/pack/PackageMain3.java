package com.kihongkim.section05.pack;

import com.kihongkim.section05.pack.a.User;

public class PackageMain3 {

    public static void main(String[] args) {
        User userA = new User();
        com.kihongkim.section05.pack.b.User userB = new com.kihongkim.section05.pack.b.User();
    }
}
