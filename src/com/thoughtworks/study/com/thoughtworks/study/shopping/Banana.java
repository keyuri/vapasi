package com.thoughtworks.study.com.thoughtworks.study.shopping;

/**
 * Created by Keyuri on 28-08-2017.
 */
public class Banana extends Item {

    public Banana(float quantity) {
        super("Banana", quantity);
    }

    // Price assumed as Rs/kg rate
    public double getPrice() {
        return 30;
    }
}
