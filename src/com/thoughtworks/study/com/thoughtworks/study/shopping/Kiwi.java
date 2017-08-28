package com.thoughtworks.study.com.thoughtworks.study.shopping;

/**
 * Created by rushabh on 28-08-2017.
 */
public class Kiwi extends Item {

    public Kiwi(float quantity) {
        super("Kiwi", quantity);
    }

    // Price assumed as Rs/kg rate
    public double getPrice() {
        return 120;
    }
}
