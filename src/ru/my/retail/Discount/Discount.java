package ru.my.retail.discount;
import ru.my.retail.product.Product;
import java.util.Objects;
public class Discount {
    private float discountOnLemonade;
    private float discountOnJuice;
    public Discount(float discountOnLemonade, float discountOnJuice){
     this.discountOnLemonade = discountOnLemonade;
     this.discountOnJuice = discountOnJuice;
    }
    public void discountsAreValid1(Product product){
        if (Objects.equals(product.getName(), "Buratino"))
            product.price = product.price - (product.price * this.discountOnLemonade / 100);
    }
    public void discountsAreValid2(Product product){
        if (Objects.equals(product.getName(), "Rich"))
            product.price = product.price - (product.price * this.discountOnJuice / 100);
    }
    public float getDiscountOnLemonade(){
        return discountOnLemonade;
    }
    public float getDiscountOnJuice(){
        return discountOnJuice;
    }
  }
