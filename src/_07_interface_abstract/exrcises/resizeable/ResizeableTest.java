package _07_interface_abstract.exrcises.resizeable;

import _07_interface_abstract.exrcises.Circle;
import _07_interface_abstract.exrcises.Rectangle;
import _07_interface_abstract.exrcises.Shape;
import _07_interface_abstract.exrcises.Square;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(5.0, 6.3);
        shapes[2] = new Square(5.2);

        System.out.println("Kích thước trước khi tăng của hình tròn: " + shapes[0].getArea());
        System.out.println("Kích thước trước khi tăng của hình chữ nhật: " + shapes[1].getArea());
        System.out.println("Kích thước trước khi tăng của hình vuông: " + shapes[2].getArea());

        System.out.print("Kích thước sau khi tăng của hình tròn: ");
        shapes[0].resize(Math.floor(Math.random() * 100));

        System.out.print("Kích thước sau khi tăng của hình chữ nhật: ");
        shapes[1].resize(Math.floor(Math.random() * 100));

        System.out.print("Kích thước sau khi tăng của hình vuông: ");
        shapes[2].resize(Math.floor(Math.random() * 100));
    }
}
