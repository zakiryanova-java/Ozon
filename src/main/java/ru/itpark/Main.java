package ru.itpark;

import ru.itpark.model.Product;
import ru.itpark.service.CartService;

public class Main {
    public static void main(String[] args) {
       Product lego1 = new Product(70419,
                "LEGO Hidden Side",
                "Бестселлер",
                "https://ozon.ru",
                2299,
                32,
                1563,
                true,
                5);
        Product lego2 = new Product(70420,
                "LEGO Hidden Side",
                "Бестселлер",
                "https://ozon.ru",
                2299,
                33,
                1540,
                true,
                4.9);
        Product lego3 = new Product(70421,
                "LEGO Hidden Side",
                "Бестселлер",
                "https://ozon.ru",
                2999,
                32,
                2039,
                true, 0);

        CartService cart = new CartService();
        cart.add(lego1);
        cart.add(lego2);
        cart.add(lego3);
        cart.remove(lego3);
        System.out.println("Ваша корзина: " + cart.getQuantity() + " товара");
        System.out.println("Товары (" + cart.getQuantity() + ") " + cart.getTotalPrice() + " руб.");
        System.out.println("Скидка " + cart.getTotalDiscount());
        System.out.println("Общая стоимость " + cart.getTotalDiscountPrice() + " руб.");
        cart.add(lego1);
        cart.remove(lego2);
        System.out.println("Ваша корзина: " + cart.getQuantity() + " товара");
        System.out.println("Товары (" + cart.getQuantity() + ") " + cart.getTotalPrice() + " руб.");
        System.out.println("Скидка " + cart.getTotalDiscount());
        System.out.println("Общая стоимость " + cart.getTotalDiscountPrice() + " руб.");

    }
}

