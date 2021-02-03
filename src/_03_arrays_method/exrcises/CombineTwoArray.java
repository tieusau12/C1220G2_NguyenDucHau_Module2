package _03_arrays_method.exrcises;

import java.util.Scanner;

public class CombineTwoArray {
    public static void main(String[] args) {
        int [] array1 = new int[10];
        int [] array2 = new int[5];
        int [] array3 = new int[array1.length+array2.length];
    }

    public static int [] addElement(int [] array){
        int n;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter a size Array : ");
            n = input.nextInt();
        } while (n <= 0);

        int[] array1;
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
        return array;
    }
}
