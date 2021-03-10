package _17_banary_stream.pratices.demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectOutputExample {
    public static void main(String[] args) {
        try {
            //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
            FileOutputStream fos = new FileOutputStream("/home/moon/C1220G2_NguyenDucHau_Module2/src/_17_banary_stream/pratices/demo/demo.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            //Khai báo mảng
            List<Stock> s = new ArrayList<>();
            s.add(new Stock(1, "CD ROM", 100, 2));
            s.add(new Stock(2, "CPU", 500, 2));
            s.add(new Stock(3, "HP Scanner", 75, 1));
            //Bước 2: Ghi mảng đối tượng vào file
            oos.writeObject(s);
            //Bước 3: Đóng luồng
            fos.close();
            oos.close();
        } catch (IOException ex) {
            System.out.println("Loi ghi file: " + ex);
        }
    }
}