package com.iut.produit;
import java.util.*;
class ShoppingCart {
    private List<AbstractProduct> Items = new ArrayList<>();
    private  double totalPrice;
    public void addItem(AbstractProduct item) {
        Items.add(item);
    }

    public double calculateTotalPrice() {
        totalPrice = 0;
        for (AbstractProduct item : Items) {
            totalPrice += item.calculatePrice();
        }
        return totalPrice;
    }
}
