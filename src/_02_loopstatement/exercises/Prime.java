package _02_loopstatement.exercises;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        System.out.println(number + "Số nguyên tố đầu tiên là  : ");
        int count = 0;
        int i = 2;
        while (count < number) {
            if (isPrimeNumber(i)) {
                System.out.println(i + " ");
                count++;
            }
            i++;
        }
    }

    public static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(number);
        for (int i = 2; i <= squareRoot; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
