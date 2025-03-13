package com.kihongkim.section12.poly.ex.pay1;

public abstract class PayStore {

    public static Pay findPay(String option) {
        if (option.equals("kakao")) {
            return new KakaoPay();dz
        }
    }
}
