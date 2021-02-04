package _03_arrays_method.exrcises;

import java.util.Arrays;
import java.util.Scanner;

public class CombineTwoArray {
    public static void main(String[] args) {
        int array1[] = new int[5];
        int array2[] = new int[4];
        for (int i = 0 ; i < array1.length ; i++){
            array1[i] = i +1;
        }
        for (int j = 0 ; j < array2.length ; j++){
            array2[j] = j + 6;
        }
        int array3[] = new int[array1.length+array2.length];
        for (int z = 0 ; z < array1.length ; z++){
            array3[z] = array1[z];
        }
        for (int e = 0 ; e < array2.length ; e++){
            array3[array1.length+e] = array2[e];
        }
        System.out.println(Arrays.toString(array1) + "\t");
        System.out.println(Arrays.toString(array2) + "\t");
        System.out.println(Arrays.toString(array3) + "\t");
//        int [] array3 = new int[array1.length+array2.length];
//    }
//
//    public static int [] addElement(int [] array){
//        int n;
//        Scanner input = new Scanner(System.in);
//        do {
//            System.out.println("Enter a size Array : ");
//            n = input.nextInt();
//        } while (n <= 0);
//
//        int[] array1;
//        array = new int[n];
//        int j = 0;
//        while (j < array.length) {
//            System.out.println("Enter element " + (j + 1) + " :");
//            array[j] = input.nextInt();
//            j++;
//        }
//        System.out.println("Elements in array : ");
//        for (int k : array) {
//            System.out.print(k + "\t");
//        }
//        return array;
    }
}
