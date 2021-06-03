package be.intecbrussel.opdrachten;

import be.intecbrussel.opdrachten.Square;

public class SquareApp {
    public static void main(String[] args) {

        Square square = new Square();

        square.setHeight(15);
        square.setWidth(24);
        square.setPosition(1 , -7);

        System.out.println("Square height:" + square.getHeight());
        System.out.println("Square width:" + square.getWidth());
        System.out.println("Square position(x,y):" + square.getX() + " " + square.getY());

        System.out.println("Square area:" + square.getArea());
        System.out.println("Square perimeter: " + square.getPerimeter());

    }
}
