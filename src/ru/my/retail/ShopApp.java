package ru.my.retail;

import ru.my.retail.builder.Builder;

import ru.my.retail.client.Client;
import ru.my.retail.product.Juice;
import ru.my.retail.product.Lemonade;
import ru.my.retail.product.Product;
import ru.my.retail.service.Service;


public class ShopApp {


    public static void main(String[] args) {


        Lemonade lemonade = Builder.buildLemonade();
        Juice juice = Builder.buildJuice();
        Lemonade lemonade2 = Builder.buildLemonade2();
        Juice juice2 = Builder.buildJuice2();
        Client Petya = new Client("Petya");

        Petya.selects(lemonade);
        Petya.selects(juice);
        Petya.selects(juice2);
        Petya.selects(lemonade2);
        Petya.selects(lemonade);

        Product[] basketProducts = Service.printBasketProducts();
        Service.sumBasketProducts(basketProducts);
        Builder.buildDiscount(lemonade, juice);
        float sum2 = Service.sumDiscounted (basketProducts);
        Service.payment(Petya, basketProducts);
        Service.gettingProducts(Petya, basketProducts, sum2);



    }







}