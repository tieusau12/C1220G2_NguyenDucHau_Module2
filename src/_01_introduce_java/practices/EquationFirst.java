package _01_introduce_java.practices;

import java.util.Scanner;

public class EquationFirst {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a : ");
        double a = scanner.nextDouble();
        System.out.println("Enter b : ");
        double b = scanner.nextDouble();
        if (a != 0) {
            double solution = -b / a;
            System.out.println("The solution  is :  %f! " + solution);
        } else {
            if (b != 0) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}
