package com.thoughtworks.study;

import com.thoughtworks.study.com.thoughtworks.study.shopping.Apple;
import com.thoughtworks.study.com.thoughtworks.study.shopping.Banana;
import com.thoughtworks.study.com.thoughtworks.study.shopping.Kiwi;
import com.thoughtworks.study.com.thoughtworks.study.shopping.Orange;

/**
 * Created by rushabh on 28-08-2017.
 */
public class App {

    public static void main(String[] args) {
        ShoppingBasket shoppingBasket = new ShoppingBasket();

        shoppingBasket.addItem(new Apple(2));
        shoppingBasket.addItem(new Orange(1.5f));
        shoppingBasket.addItem(new Banana(0.5f));
        shoppingBasket.addItem(new Kiwi(0.75f));

        shoppingBasket.printReceipt();
    }
}
