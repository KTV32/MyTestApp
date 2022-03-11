package ru.my.retail.basket;
import ru.my.retail.product.Product;
public class Basket {
    private int countOfProducts;
    private final Product[] products;
    public Basket(){
        this.countOfProducts = 0;
        this.products = new Product[5];
    }
    public void addProduct(Product product){
        this.countOfProducts++;
       switch (countOfProducts){
           case 1 -> products[0] = product;
           case 2 -> products[1] = product;
           case 3 -> products[2] = product;
           case 4 -> products[3] = product;
           case 5 -> products[4] = product;
       }
        }
    public Product[] getProducts(){
        return products;
    }
    public int getCountOfProducts() {
        return countOfProducts;
    }
}
