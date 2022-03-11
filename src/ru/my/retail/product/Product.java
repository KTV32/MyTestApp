package ru.my.retail.product;
public abstract class Product {
    public  float price;
    private String name;
    private String status;
    public Product(String name, int price){
        this.name = name;
        this.price = price;
        status = " в наличии ";
    }
    @Override
    public String toString(){
        return "Product{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public String getName(){
        return name;
    }
    public float getPrice(){
        return price;
    }
}
