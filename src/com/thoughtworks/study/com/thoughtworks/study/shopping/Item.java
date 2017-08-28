package com.thoughtworks.study.com.thoughtworks.study.shopping;

/**
 * Created by rushabh on 28-08-2017.
 */
public abstract class Item implements PriceableItem {

    private String itemName;
    private float quantity = 0.0f;

    public Item(String iName, float iQuantity) {
        itemName = iName;
        quantity = iQuantity;
    }

    public float getQuantity() {
        return quantity;
    }

    public String getItemName() {
        return itemName;
    }
}
