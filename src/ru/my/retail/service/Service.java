package ru.my.retail.service;

import ru.my.retail.client.Client;
import ru.my.retail.product.Product;

import static ru.my.retail.client.Client.basket;

public class Service {

    public static void gettingProducts(Client Petya, Product[] basketProducts, float sum2) {
        for (Product bask : basketProducts) {

            Petya.receives(bask);
        }

        System.out.println(Petya.getName() + " получил " + basketProducts.length + " товаров" + " на сумму " + sum2);

        for (Product bask : basketProducts) {

            bask.setStatus( " продано ");
            System.out.println(bask.getName() + bask.getStatus());
        }
    }

    public static void payment(Client Petya, Product[] basketProducts) {
        for (Product bask : basketProducts) {

            Petya.pays(bask);

            bask.setStatus( " оплачено ");
            System.out.println(bask.getName() + bask.getStatus());
        }
    }

    public static float sumDiscounted (Product[] basketProducts) {
        float sum2 = 0;
        for (Product basketProduct : basketProducts) {
            sum2 += basketProduct.getPrice();
        }

        System.out.println("Итого: " + sum2 + " руб.");
        return sum2;
    }



    public static void sumBasketProducts(Product[] basketProducts) {
        int sum = 0;
        for (Product basketProduct : basketProducts) {
            sum += basketProduct.getPrice();
        }
        System.out.println("Общая стоимость товаров в корзине: " + sum + " руб.");
    }

    public static Product[] printBasketProducts() {
        Product[] basketProducts = basket.getProducts();
        for (Product bask : basketProducts) {
            System.out.println("В корзине: " + bask.toString());

        }
        return basketProducts;
    }
}
