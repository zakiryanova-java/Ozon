package ru.itpark.service;

import ru.itpark.model.Product;

public class CartService {
    private int quantity;
    private int totalPrice;
    private int totalDiscount;
    private int totalDiscountPrice;

    public CartService() {
    }

    public int getQuantity() {
        return quantity;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public int getTotalDiscount() {
        return totalDiscount;
    }

    public int getTotalDiscountPrice() {
        return totalDiscountPrice;
    }


    public void add(Product product) {
        quantity++;
        totalPrice += product.getPrice();
        totalDiscountPrice += product.getDiscountPrice();
        totalDiscount=totalPrice-totalDiscountPrice;
    }

    public void remove(Product product) {
        quantity--;
        totalPrice -= product.getPrice();
        totalDiscountPrice -= product.getDiscountPrice();
        totalDiscount=totalPrice-totalDiscountPrice;

    }



    }



