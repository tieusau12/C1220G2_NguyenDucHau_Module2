package _05_access_modifier.pratices;

import _05_access_modifier.exrcises.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.getRadius());
        Circle circle1 = new Circle(10);
        System.out.println(circle1.getArea());
    }
}
