package com.huseyin.designpatterns;

public class Demo {

    public static void main(String[] args) {
        Bitcoin bitcoin =  new Bitcoin();

        Trader trader = new Trader();
        Bot bot = new Bot();
        Corporate corporate = new Corporate();
        Student student = new Student();

        bitcoin.subscribe(trader);
        bitcoin.subscribe(student);
        bitcoin.subscribe(bot);
        bitcoin.subscribe(corporate);

        bitcoin.setPrice(32);

        bitcoin.unsubscribe(trader);

        bitcoin.setPrice(12);
    }
}
