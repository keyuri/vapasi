package com.thoughtworks.study.com.thoughtworks.study.shopping;

/**
 * Created by rushabh on 28-08-2017.
 */
public class Apple extends Item {

    public Apple(float quantity) {
        super("Apple", quantity);
    }

    // Price assumed as Rs/kg rate
    public double getPrice() {
        return 100;
    }
}
