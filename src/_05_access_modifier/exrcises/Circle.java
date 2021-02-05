package _05_access_modifier.exrcises;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double r) {
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        double area = radius*radius*Math.PI;
        return area;

    }
}
