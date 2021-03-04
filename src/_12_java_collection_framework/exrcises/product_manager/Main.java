package _12_java_collection_framework.exrcises.product_manager;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager(new ArrayList<>());
        Product product1 = new Product(1,"Nokia",500);
        Product product2 = new Product(2,"Samsung",700);
        Product product3 = new Product(3,"Xiaomi",600);
        Product product4 = new Product(4,"iPhone",900);
        Product product5 = new Product(5,"Vertu",1000);
        productManager.addProduct(product1);
        productManager.addProduct(product2);
        productManager.addProduct(product3);
        productManager.addProduct(product4);
        productManager.addProduct(product5);
        productManager.displayProduct();

        System.out.println("___________________________");

        Product newProduct = new Product(6,"Huawei",550);
        productManager.editProduct(newProduct);
        productManager.displayProduct();

        System.out.println("___________________________");

        productManager.deleteProduct(new Product(1,"Xiaomi",222));
        productManager.displayProduct();

        System.out.println("___________________________");
        System.out.println("Tìm kiếm sản phẩm");
        productManager.searchProduct("iPhone");
    }
}
