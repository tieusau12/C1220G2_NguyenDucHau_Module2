package _12_java_collection_framework.exrcises.product_manager;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    List<Product> productList;
    public ProductManager(List<Product> productList) {
        this.productList = productList;
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void editProduct(Product product) {
        int index = productList.indexOf(product);
        if (index == -1) {
            addProduct(product);
        } else {
            this.productList.set(index, product);
        }
    }

    public void deleteProduct(Product product){
        this.productList.remove(product);
    }

    public void displayProduct(){
        for (Product product: productList) {
            System.out.println(product);
        }
    }
    public void searchProduct(String name){
        if (productList.size()==0){
            System.out.println("Chưa có sản phẩm");
        }else {
            boolean flag = false;
            for (Product product: productList) {
                if (product.getNameProduct().equals(name)){
                    System.out.println(product);
                    flag = true;
                    break;
                }
            }if (!flag){
                System.out.println("Không tìm thấy tên sản phẩm");
            }
        }
    }
}
