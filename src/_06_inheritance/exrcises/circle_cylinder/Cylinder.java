package _06_inheritance.exrcises.circle_cylinder;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getVolume() {
        return this.height * super.getArea();
    }

    @Override
    public String toString() {
        return "Cylinder{ "
                + " height = "
                + height
                + " and have bottom "
                + super.toString();
    }
}
