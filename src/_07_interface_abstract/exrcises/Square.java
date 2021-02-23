package _07_interface_abstract.exrcises;

import _07_interface_abstract.exrcises.colorable.Colorable;
import _07_interface_abstract.exrcises.resizeable.Resizeable;

public class Square extends Rectangle implements Resizeable , Colorable {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        double newSquare = this.getArea() * (percent / 100);
        System.out.println(newSquare);
        System.out.println();
    }


    @Override
    public void howToColor() {
        System.out.println("Color all four sides..");
    }
}
