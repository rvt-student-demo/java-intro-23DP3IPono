package lv.rvt;

import java.util.ArrayList;

abstract class GeometricShape {
    abstract double getArea();

    abstract double getPerimeter();

    abstract void displayInfo();

    public static void main(String[] args) {
        Circle circle = new Circle(8.0);
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);

        ArrayList<GeometricShape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(triangle);

        for (GeometricShape shape : shapes) {
            shape.displayInfo();
            System.out.println();
        }
    }

}
