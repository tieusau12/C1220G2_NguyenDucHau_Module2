package _03_arrays_method.exrcises;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        int size;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter a size Array : ");
            size = input.nextInt();
        } while (size <= 0);

        int[] arrayNumber;
        arrayNumber = new int[size];
        int j = 0;
        while (j < arrayNumber.length) {
            System.out.println("Enter element " + (j + 1) + " :");
            arrayNumber[j] = input.nextInt();
            j++;
        }
        System.out.println("Elements in array : ");
        for (int i = 0; i < arrayNumber.length; i++) {
            System.out.print(arrayNumber[i] + "\t");
        }

        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to Find :");
        number = scanner.nextInt();

        boolean check = true;
        for (int i = 0; i < arrayNumber.length; i++) {
            if (number == arrayNumber[i]) {
                if (i < arrayNumber.length - 1) {
                    int swap;
                    swap = arrayNumber[i];
                    arrayNumber[i] = arrayNumber[i + 1];
                    arrayNumber[i + 1] = swap;
                }
                check = false;
            }
        }
        if (check) {
            System.out.println(" Not found " + number + "in array !");
        } else {
            arrayNumber[arrayNumber.length - 1] = 0;
            System.out.println(Arrays.toString(arrayNumber));
        }
    }
}
