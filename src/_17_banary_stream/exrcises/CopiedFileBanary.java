//package _17_banary_stream.exrcises;
//
//import java.io.*;
//import java.util.Scanner;
//
//public class CopiedFileBanary implements Serializable {
//    public static final String SOURCE = "/home/moon/C1220G2_NguyenDucHau_Module2/src/_17_banary_stream/exrcises/source.txt";
//    public static final String TARGET = "/home/moon/C1220G2_NguyenDucHau_Module2/src/_17_banary_stream/exrcises/target.txt";
//
//    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Nhap duong dan file goc : ");
////        String source = sc.nextLine();
////        System.out.println("Nhap duong dan file dich : ");
////        String target = sc.nextLine();
//
//        FileOutputStream fos = null;
//        ObjectOutputStream oos = null;
//        FileInputStream fis = null;
//        ObjectInputStream ois = null;
//        try {
//            fos = new FileOutputStream(TARGET);
//            oos = new ObjectOutputStream(fos);
//            fis = new FileInputStream(SOURCE);
//            ois = new ObjectInputStream(fis);
//            int byteRead;
//            while ((byteRead = (int) ois.readObject()) != -1) {
//                oos.writeObject(byteRead);
//            }
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                assert fis != null;
//                fis.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            try {
//                assert ois != null;
//                ois.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            try {
//                assert fos != null;
//                fos.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            try {
//                assert oos != null;
//                oos.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
