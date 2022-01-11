package ru.my.retail.product;


import ru.my.retail.basket.Basket;

public class Product {


    public  float price;
    private String name;
    private String status;


    public Product(String name, int price) {
        this.name = name;
        this.price = price;
        status = " в наличии ";

    }



    public Product(int price){
        this.price = price;

    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", name='" + name + '\'' +

                '}';
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }


}
