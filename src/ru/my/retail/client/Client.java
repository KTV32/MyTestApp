package ru.my.retail.client;

import ru.my.retail.basket.Basket;
import ru.my.retail.product.Product;

public class Client {

    private String name;
    public static Basket basket;




    public Client(String name) {
        this.name = name;
        basket = new Basket();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void selects(Product product){
        basket.addProduct(product);
        System.out.println(name + " выбрал " + product + " и положил его в корзину");

    }


    public void pays(Product product){
        System.out.println(name + " оплатил " + product);


    }
    public void receives(Product product){

    }


}
