package ru.my.retail;

import ru.my.retail.Discount.Discount;
import ru.my.retail.basket.Basket;
import ru.my.retail.client.Client;
import ru.my.retail.product.Juice;
import ru.my.retail.product.Lemonade;
import ru.my.retail.product.Product;



public class ShopApp {


    public static void main(String[] args) {


        Product lemonade = new Lemonade("Buratino", 45);
        Product juice = new Juice("Rich", 95);
        Product lemonade2 = new Lemonade("Dushes", 40);
        Product juice2 = juice;




        if (lemonade.getStatus() == " в наличии ") {
            System.out.println(lemonade.getName() + lemonade.getStatus());
        }

        if (juice.getStatus() == " в наличии ") {
            System.out.println(juice.getName() + juice.getStatus());
        }

        if (lemonade2.getStatus() == " в наличии ") {
            System.out.println(lemonade2.getName() + lemonade2.getStatus());
        }


        Client Petya = new Client("Petya");

        Basket basket = new Basket();

        Discount discount = new Discount(15, 20);


        Petya.selects(lemonade);
        System.out.println(Petya.getName() + " выбрал " + lemonade.getName());

        Product[] basketProducts = basket.getProducts();


        basket.addProduct(lemonade);

        Petya.putInBasket(lemonade);
        System.out.println(Petya.getName() + " положил в корзину " + lemonade.getName());


        Petya.selects(juice);
        System.out.println(Petya.getName() + " выбрал " + juice.getName());

        basket.addProduct(juice);

        Petya.putInBasket(juice);
        System.out.println(Petya.getName() + " положил в корзину " + juice.getName());

        Petya.selects(juice2);
        System.out.println(Petya.getName() + " выбрал " + juice2.getName());

        basket.addProduct(juice2);
        Petya.putInBasket(juice);
        System.out.println(Petya.getName() + " положил в корзину " + juice2.getName());

        Petya.selects(lemonade2);
        System.out.println(Petya.getName() + " выбрал " + lemonade2.getName());

        basket.addProduct(lemonade2);
        Petya.putInBasket(lemonade2);
        System.out.println(Petya.getName() + " положил в корзину " + lemonade2.getName());

        Petya.selects(lemonade);
        System.out.println(Petya.getName() + " выбрал " + lemonade.getName());

        basket.addProduct(lemonade);

        Petya.putInBasket(lemonade);
        System.out.println(Petya.getName() + " положил в корзину " + lemonade.getName());


        for (Product bask : basketProducts) {
            System.out.println("В корзине: " + bask.toString());

        }

        int sum = 0;
        basketProducts = basket.getProducts();
        for (int j = 0; j < basketProducts.length; j++) {
            sum += basketProducts[j].getPrice();
        }
        System.out.println("Общая стоимость товаров в корзине: " + sum + " руб.");


        discount.discountsAreValid1(lemonade);
        discount.discountsAreValid2(juice);

        System.out.println("Скидка на " + lemonade.getName() + " = " + discount.getDiscountOnLemonade() + " %");
        System.out.println("Скидка на " + juice.getName() + " = " + discount.getDiscountOnJuice() + " %");


        float sum2 = 0;

        for (int j = 0; j < basketProducts.length; j++) {

            sum2 += basketProducts[j].getPrice();
        }

        System.out.println("Итого: " + sum2 + " руб.");



        for (int j = 0; j < basketProducts.length; j++) {

           basketProducts[j].setStatus(" ожидает оплату ");


        }
        for (Product bask : basketProducts) {

            Petya.pays(bask);

        }

        System.out.println(Petya.getName() + " оплатил " + sum2 + "руб." + " за " + basketProducts.length + " товаров");

        for (Product bask : basketProducts) {

            bask.setStatus( " оплачено ");
            System.out.println(bask.getName() + bask.getStatus());
        }

        

        for (Product bask : basketProducts) {

            Petya.receives(bask);
        }

        System.out.println(Petya.getName() + " получил " + basketProducts.length + " товаров" );

        for (Product bask : basketProducts) {

            bask.setStatus( " продано ");
            System.out.println(bask.getName() + bask.getStatus());
        }





    }

}