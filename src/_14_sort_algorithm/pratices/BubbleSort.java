package _14_sort_algorithm.pratices;

import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        boolean needNextPass = true;
        for (int i = 1; i < array.length && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    needNextPass = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao do dai mang ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Mang co " + array.length + " co cac gia tri la : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Mang ban nhap ban dau la : ");
        for (int j : array) {
            System.out.print(j + "\t");
        }
        System.out.println("\n Mang bat dau sap xep : ");
        bubbleSort(array);
        for (int j : array) {
            System.out.print(j+ "\t");
        }
    }
}

