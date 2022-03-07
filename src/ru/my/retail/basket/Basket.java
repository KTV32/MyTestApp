package ru.my.retail.basket;

import ru.my.retail.product.Product;

public class Basket {

    private int countOfProducts;
    private final Product [] products;

    public Basket(){
        this.countOfProducts = 0;
        this.products = new Product[5];

    }

    public void addProduct(Product product){

        this.countOfProducts++;
        if (products[0] == null)
            this.products[products.length - 5] = product;
            else if (products[1] == null)
                this.products[products.length - 4] = product;
            else if (products[2] == null)
                this.products[products.length - 3] = product;
            else if (products[3] == null)
                this.products[products.length - 2] = product;
            else if (products[4] == null)
                this.products[products.length - 1] = product;
            else if (products[5] != null)
                System.out.println(" Корзина заполнена! ");


        }


    public Product[] getProducts(){
        return products;
    }

    public int getCountOfProducts() {
        return countOfProducts;
    }


}
