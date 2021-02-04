package _04_class_and_object.exrcises;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;
    double delta, r1, r2;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return delta = b * b - 4 * a * c;
    }

    public double getRoot1() {
        return r1 = (-b + Math.pow((b * b - 4 * a * c), 0.5)) / 2 * a;
    }

    public double getRoot2() {
        return r2 = (-b - Math.pow((b * b - 4 * a * c), 0.5)) / 2 * a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a : ");
        double a = scanner.nextDouble();
        System.out.println("Enter b : ");
        double b = scanner.nextDouble();
        System.out.println("Enter c : ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if(quadraticEquation.getDiscriminant() <0){
            System.out.println("The equation has no roots");
        }else if(quadraticEquation.getDiscriminant()==0){
            System.out.println("Equation has one solution " + quadraticEquation.getRoot1());
        }   else{
            System.out.println("Equation has two solution :" + quadraticEquation.getRoot1() +" and " + quadraticEquation.getRoot2());
        }

    }

}
