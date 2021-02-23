package _07_interface_abstract.exrcises.colorable;

import _07_interface_abstract.exrcises.Circle;
import _07_interface_abstract.exrcises.Rectangle;
import _07_interface_abstract.exrcises.Shape;
import _07_interface_abstract.exrcises.Square;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3.5);
        shapes[1] = new Rectangle(5.2, 6.0);
        shapes[2] = new Square(5.5);

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Area " + shapes[i].getArea());
            if (shapes[i] instanceof Square) {
                Colorable colorable = (Colorable) shapes[i];
                colorable.howToColor();
            }
        }
    }
}
