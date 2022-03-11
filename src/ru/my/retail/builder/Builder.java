package ru.my.retail.builder;
import ru.my.retail.discount.Discount;
import ru.my.retail.product.Juice;
import ru.my.retail.product.Lemonade;
import java.util.Objects;
public class Builder {
    public static void buildDiscount(Lemonade lemonade, Juice juice) {
        Discount discount = new Discount(15, 20);
        discount.discountsAreValid1(lemonade);
        discount.discountsAreValid2(juice);
        System.out.println("Скидка на " + lemonade.getName() + " = " + discount.getDiscountOnLemonade() + " %");
        System.out.println("Скидка на " + juice.getName() + " = " + discount.getDiscountOnJuice() + " %");
    }
    public static Juice buildJuice2() {
        Juice juice2 = new Juice("Dobriy", 90);
        if (Objects.equals(juice2.getStatus(), " в наличии ")) {
            System.out.println(juice2.getName() + juice2.getStatus());
        }
        return juice2;
    }
    public static Lemonade buildLemonade2() {
        Lemonade lemonade2 = new Lemonade("Dushes", 40);
        if (Objects.equals(lemonade2.getStatus(), " в наличии ")) {
            System.out.println(lemonade2.getName() + lemonade2.getStatus());
        }
        return lemonade2;
    }
    public static Juice buildJuice() {
        Juice juice = new Juice("Rich", 95);
        if (Objects.equals(juice.getStatus(), " в наличии ")) {
            System.out.println(juice.getName() + juice.getStatus());
        }
        return juice;
    }
    public static Lemonade buildLemonade() {
        Lemonade lemonade = new Lemonade("Buratino", 45);
        if (Objects.equals(lemonade.getStatus(), " в наличии ")) {
            System.out.println(lemonade.getName() + lemonade.getStatus());
        }
        return lemonade;
    }
    public static Juice buildJuice3() {
        Juice juice3 = new Juice("Ya", 105);
        if (Objects.equals(juice3.getStatus(), " в наличии ")) {
            System.out.println(juice3.getName() + juice3.getStatus());
        }
        return juice3;
    }
}
