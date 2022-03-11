package ru.my.retail.service;
import ru.my.retail.client.Client;
import ru.my.retail.product.Product;
import static ru.my.retail.client.Client.basket;
public class Service {
    public static void gettingProducts(Client client, Product[] basketProducts, float sum2) {
        for (Product bask : basketProducts) {
            client.receives(bask);
        }
        System.out.println(client.getName() + " получил " + basketProducts.length + " товаров" + " на сумму " + sum2);
        for (Product bask : basketProducts) {
            bask.setStatus( " продано ");
            System.out.println(bask.getName() + bask.getStatus());
        }
    }
    public static void payment(Client client, Product[] basketProducts) {
        for (Product bask : basketProducts) {
            client.pays(bask);
            bask.setStatus( " оплачено ");
            System.out.println(bask.getName() + bask.getStatus());
        }
    }
    public static float sumDiscounted (Product[] basketProducts) {
        float sum2 = 0;
        for (Product basketProduct : basketProducts) {
            sum2 += basketProduct.getPrice();
        }
        System.out.println("Итого со скидкой: " + sum2 + " руб.");
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
        System.out.println("Количество товаров в корзине " + basket.getCountOfProducts() + " шт.:");
        for (Product bask : basketProducts) {
            System.out.println(bask.toString());
        }
        return basketProducts;
    }
}
