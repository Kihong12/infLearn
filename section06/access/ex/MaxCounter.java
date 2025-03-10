package com.kihongkim.section06.access.ex;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int num) {
        this.max = num;
    }

    public void increment() {
        if (count >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        } else {
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}

