package _17_banary_stream.exrcises;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopiedFileBanary implements Serializable {

    public static final String SOURCE = "/home/moon/C1220G2_NguyenDucHau_Module2/src/_17_banary_stream/exrcises/product.txt";
    public static final String TARGET = "/home/moon/C1220G2_NguyenDucHau_Module2/src/_17_banary_stream/exrcises/target.txt";

    public static void main(String[] args) {
        readProduct();

    }

    public static void writeProduct(List<Product> productList) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(TARGET);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(productList);
            fos.close();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readProduct() {
        try {
            FileInputStream fis = new FileInputStream(SOURCE);
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Product> sArr = (List<Product>) ois.readObject();
            for (Product s : sArr) {
                System.out.println(s.toString());
            }
            writeProduct(sArr);
            fis.close();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
