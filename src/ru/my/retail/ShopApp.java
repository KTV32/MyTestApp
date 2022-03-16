package ru.my.retail;
import ru.my.retail.builder.Builder;
import ru.my.retail.client.Client;
import ru.my.retail.product.Juice;
import ru.my.retail.product.Lemonade;
import ru.my.retail.product.Product;
import ru.my.retail.service.Service;
import ru.my.retail.warehouse.Warehouse;
import java.util.Collection;
public class ShopApp {
    public static void main(String[] args) {
        Lemonade lemonade = Builder.buildLemonade();
        Juice juice = Builder.buildJuice();
        Lemonade lemonade2 = Builder.buildLemonade2();
        Juice juice2 = Builder.buildJuice2();
        Juice juice3 = Builder.buildJuice3();
        Client Petya = new Client("Petya");
        Warehouse warehouse = new Warehouse();
        Collection<Product> warehouse1 = warehouse.getWarehouse();
        warehouse1.add(lemonade);
        warehouse1.add(lemonade2);
        warehouse1.add(juice);
        warehouse1.add(juice2);
        warehouse1.add(juice3);
        warehouse1.add(new Lemonade("Cola", 87));
        Petya.selects(lemonade);
        Petya.selects(juice);
        Petya.selects(juice2);
        Petya.selects(lemonade2);
        Petya.selects(juice3);
        warehouse1.remove(Petya.selects(lemonade));
        warehouse1.remove(Petya.selects(juice));
        warehouse1.remove(Petya.selects(juice2));
        warehouse1.remove(Petya.selects(juice3));
        warehouse1.remove(Petya.selects(lemonade2));
        Product[] basketProducts = Service.printBasketProducts();
        Service.sumBasketProducts(basketProducts);
        Builder.buildDiscount(lemonade, juice);
        float sum2 = Service.sumDiscounted (basketProducts);
        Service.payment(Petya, basketProducts);
        Service.gettingProducts(Petya, basketProducts, sum2);
    }
}