package ru.my.retail.Discount;

import ru.my.retail.ShopApp;
import ru.my.retail.product.Lemonade;
import ru.my.retail.product.Product;

public class Discount {

    private float discountOnLemonade;
    private float discountOnJuice;



    public Discount(float discountOnLemonade, float discountOnJuice){
     this.discountOnLemonade = discountOnLemonade;
     this.discountOnJuice = discountOnJuice;

    }

    public void discountsAreValid1(Product product) {
        if (product.getName() == "Buratino")
            product.price = product.price - (product.price * this.discountOnLemonade / 100);
    }
    public void discountsAreValid2(Product product){

        if (product.getName() == "Rich")
            product.price = product.price - (product.price * this.discountOnJuice / 100);
    }




    public float getDiscountOnLemonade() {
        return discountOnLemonade;
    }

    public void setDiscountOnLemonade(float discountOnLemonade) {
        this.discountOnLemonade = discountOnLemonade;
    }

    public float getDiscountOnJuice() {
        return discountOnJuice;
    }

    public void setDiscountOnJuice(float discountOnJuice) {
        this.discountOnJuice = discountOnJuice;
    }
}
