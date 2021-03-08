package _15_debug_exception.exrcises;

import java.util.Scanner;

public class IllegalTriangleException {
    public void checkSide(double edgeOne, double edgeTwo, double edgeThree) {
        try {
            if (edgeOne + edgeTwo > edgeThree || edgeOne + edgeThree > edgeTwo || edgeTwo + edgeThree > edgeOne && edgeOne > 0 && edgeTwo > 0 && edgeThree > 0) {
                System.out.println("Canh thu nhat cua tam giac :" + edgeOne);
                System.out.println("Canh thu hai cua tam giac :" + edgeTwo);
                System.out.println("Canh thu ba cua tam giac :" + edgeThree);
                double perimeterTriangle = edgeOne + edgeTwo + edgeThree;
                System.out.println("Chu vi cua tam giac day la : " + perimeterTriangle);
            }
        } catch (Exception e) {
                System.err.println("Xay ra ngoai le : " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap canh thu nhat cua tam giac : ");
        double edgeOne = scanner.nextDouble();
        System.out.println("Nhap canh thu nhat cua tam giac : ");
        double edgeTwo = scanner.nextDouble();
        System.out.println("Nhap canh thu nhat cua tam giac : ");
        double edgeThree = scanner.nextDouble();
        IllegalTriangleException triangleException = new IllegalTriangleException();
        triangleException.checkSide(edgeOne,edgeTwo,edgeThree);
    }
}
