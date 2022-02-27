package ru.my.retail;

public class Delivery {
    private int id;
    private int deliveryDate;
    private String deliveryAdress;
    private int money;

    public Delivery(int id, int deliveryDate, String deliveryAdress, int money){
        this.id = id;
        this.deliveryDate = deliveryDate;
        this.deliveryAdress = deliveryAdress;
        this.money = money;
    }
    public void setDeliveryAdress(String deliveryAdress) {
        this.deliveryAdress = deliveryAdress;
    }
}
