package com.thoughtworks.study.com.thoughtworks.study.shopping;

/**
 * Created by Keyuri on 28-08-2017.
 */
public class Orange extends Item {

    public Orange(float quantity) {
        super("Orange", quantity);
    }

    // Price assumed as Rs/kg rate
    public double getPrice() {
        return 80;
    }
}
