package _02_loopstatement.exercises;

import java.util.Scanner;

public class Draw {
    public static void main(String[] args) {
        int draw;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
        draw = scanner.nextInt();
        switch (draw) {
            case 1:
                System.out.println("Print the rectangle");
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 6; j++) {
                        System.out.print(" * ");
                    }
                    System.out.println(" ");
                }
                break;
            case 2:
                System.out.println(" Print the square triangle ");
                for (int i = 1; i <= 5; i++) {
                    for (int k = 1; k <i; k++) {
                        System.out.print("* ");
                    }
                    System.out.println(" ");
                }
                break;
            case 3:
                System.out.println("Print isosceles triangle");
                for (int i = 1; i <= 5; i++) {
                    for (int k = 5; k >= i; k--) {
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
                break;
        }
    }
}
