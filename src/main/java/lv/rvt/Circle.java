package lv.rvt;

 class Circle extends GeometricShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return  3.14 * radius * radius;
    }

    @Override
    double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    @Override
    void displayInfo() {
        System.out.println("Circle:");
        System.out.println("Radius = " + radius);
        System.out.println("Area = " + getArea());
        System.out.println("Perimeter =" + getPerimeter());
    }
}
