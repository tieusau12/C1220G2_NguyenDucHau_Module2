package _03_arrays_method.pratices;

import java.util.Scanner;

public class ReverseElement {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size : ");
            size = scanner.nextInt();
            if(size >20){
                System.out.println("Size does not exceed 20");
            }
        } while (size >20);
    }
}
