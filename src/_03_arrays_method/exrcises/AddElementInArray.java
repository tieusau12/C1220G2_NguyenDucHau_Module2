package _03_arrays_method.exrcises;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementInArray {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter a size Array : ");
            n = input.nextInt();
        } while (n <= 0);

        int[] array;
        array = new int[n];
        int j = 0;
        while (j < array.length) {
            System.out.println("Enter element " + (j + 1) + " :");
            array[j] = input.nextInt();
            j++;
        }
        System.out.println("Elements in array : ");
        for (int k : array) {
            System.out.print(k + "\t");
        }
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to Insert :");
        number = scanner.nextInt();
        int index;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter index element :");
        index = scanner1.nextInt();

        if (index <= 1 || index >= array.length - 1) {
            System.out.println("Not Insert element in Array !");
        } else {
            for (int i = array.length - 1; i >= index; i--) {
                int temp;
                temp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = temp;
            }
            array[index - 1] = number;
            System.out.println(" New array " + Arrays.toString(array));
            // System.out.println("New array " + Arrays.toString(addOneIntToArray(array, number, index)));
        }
    }

//    public static int[] addOneIntToArray(int[] array, int number, int index) {
//        int[] newArray = new int[array.length + 1];
//        for (int i = array.length - 1; i >= index; i--) {
//            int temp;
//            temp = array[i];
//            array[i] = array[i - 1];
//            array[i - 1] = temp;
//        }
//        array[index - 1] = number;
//
//        return array;
//    }

}
