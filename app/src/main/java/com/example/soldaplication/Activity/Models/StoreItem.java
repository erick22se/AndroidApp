package com.example.soldaplication.Activity.Models;

/**
 * Created by Gabo on 27/09/2017.
 */

public class StoreItem {
    String name;
    int quantity;
    double price;

    public StoreItem() {
    }

    public StoreItem(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public StoreItem setName(String name) {
        this.name = name;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public StoreItem setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public StoreItem setPrice(double price) {
        this.price = price;
        return this;
    }

    public String getQuantityString(){
        return Integer.toString(quantity);
    }

    public String getPriceString(){
        return Double.toString(price);
    }
}
