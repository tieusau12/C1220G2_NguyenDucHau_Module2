package _17_banary_stream.pratices.demo;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class ObjectInputExample {
    public static void main(String[] args) {
        try {
            //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
            FileInputStream fis = new FileInputStream("/home/moon/C1220G2_NguyenDucHau_Module2/src/_17_banary_stream/pratices/demo/demo.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            //Bước 2: Đọc dữ liệu
            List<Stock> sArr = (List<Stock>) ois.readObject();
            for (Stock s : sArr) {
                System.out.println(s.toString());
            }
            //Bước 3: Đóng luồng
            fis.close();
            ois.close();
        } catch (Exception ex) {
            System.out.println("Loi doc file: " + ex);
        }
    }
}