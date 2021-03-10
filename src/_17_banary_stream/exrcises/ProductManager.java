package _17_banary_stream.exrcises;

import java.io.*;
import java.util.List;

public class ProductManager {
    List<Product> productList;
    public static final String LINK = "/home/moon/C1220G2_NguyenDucHau_Module2/src/_17_banary_stream/exrcises/product.txt";

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public ProductManager(List<Product> productList) {
        this.productList = productList;
    }

    public void addProduct(Product product) {
        this.productList.add(product);
    }

    public void displayProduct() {
//        for (Product product : productList) {
//            System.out.println(product);
//        }
        readProduct();
    }

    public void searchProduct(Integer id) {
        if (productList.size() == 0) {
            System.out.println(" Chua co san pham nao !!");
        } else {
            boolean flag = false;
            for (Product product : productList) {
                if (product.getId() == id) {
                    System.out.println(product);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("Không tìm thấy tên sản phẩm");
            }
        }
    }

    public void writeProduct(List<Product> productList) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(LINK);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(productList);
            fos.close();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void readProduct(){
        try {
            FileInputStream fis = new FileInputStream(LINK);
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Product> sArr = (List<Product>) ois.readObject();
            for (Product s: sArr) {
                System.out.println(s.toString());
            }
            fis.close();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
