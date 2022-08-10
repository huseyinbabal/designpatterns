package com.huseyin.designpatterns;

public class Trader implements User{

    private final static int INVESTMENT_FACTOR = 10;

    public void update(int price) {
        System.out.println("I am a trader, and I will invest " + price * INVESTMENT_FACTOR);
    }
}
