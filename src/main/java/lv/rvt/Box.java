package lv.rvt;

public class Box {
    private double width;
    private double height;
    private double length;

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box(double side) {
        this.width = side;
        this.height = side;
        this.length = side;
    }

    public double area() {
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea();
    }
    
    public double volume() {
        return width * height * length;
    }

    private double faceArea() {
        return width * height;
    }

    private double topArea() {
        return width * length;
    }
 
    private double sideArea() {
        return height * length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }
}
