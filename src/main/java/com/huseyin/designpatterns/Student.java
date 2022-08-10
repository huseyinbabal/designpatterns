package com.huseyin.designpatterns;

public class Student implements User{

    private final static int INVESTMENT_FACTOR = 1;

    public void update(int price) {
        System.out.println("I am a student, and I will invest " + price * INVESTMENT_FACTOR);
    }
}
