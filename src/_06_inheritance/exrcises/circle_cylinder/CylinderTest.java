package _06_inheritance.exrcises.circle_cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(3.5, 4,"yellow");
        System.out.println(cylinder);
        System.out.println(cylinder.getVolume());
    }
}
