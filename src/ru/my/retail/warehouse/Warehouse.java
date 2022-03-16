package ru.my.retail.warehouse;
import ru.my.retail.product.Product;
import java.util.ArrayList;
import java.util.Collection;
public class Warehouse {
    private Collection<Product> warehouse;
   public Warehouse() {
       this.warehouse = new ArrayList<>();
   }
    public Collection<Product> getWarehouse() {
        return warehouse;
    }
}