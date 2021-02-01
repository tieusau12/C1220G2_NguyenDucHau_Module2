package _01_introduce_java.exercises;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the year :");
        int number = scanner.nextInt();
        int ones = number /10;
        System.out.println(ones);
    }
}
