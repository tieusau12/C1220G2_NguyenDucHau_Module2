package _01_introduce_java.practices;

import java.util.Scanner;

public class UseOperators {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width :");
        width = scanner.nextFloat();
        System.out.println("Enter height :");
        height = scanner.nextFloat();
        float are = width * height;
        System.out.println("Area is : " + are);
    }
}
