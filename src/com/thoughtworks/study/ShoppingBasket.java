package com.thoughtworks.study;

import com.thoughtworks.study.com.thoughtworks.study.shopping.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rushabh on 28-08-2017.
 */
public class ShoppingBasket {
    List<Item> itemList = new ArrayList<Item>();


    public void addItem(Item inItem) {
        itemList.add(inItem);
    }


    public void printReceipt() {
        double totalAmount = 0;

        printHeading();
        for (Item item : itemList) {
            double itemAmount = item.getQuantity() * item.getPrice();
            totalAmount += itemAmount;
            System.out.println(item.getItemName() + "    " + item.getQuantity() + "   " + itemAmount);
        }

        System.out.println("-----------------------------------");
        System.out.println("Total Amount = " + totalAmount);

    }

    private void printHeading() {

        System.out.println("Fruit   Quantity    Amount");
        System.out.println("----------------------------------");
    }


}
