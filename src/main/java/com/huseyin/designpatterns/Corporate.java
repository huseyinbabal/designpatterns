package com.huseyin.designpatterns;

public class Corporate implements User{

    private final static int INVESTMENT_FACTOR = 5;

    public void update(int price) {
        System.out.println("I am a corporate, and I will invest " + price * INVESTMENT_FACTOR);
    }
}
