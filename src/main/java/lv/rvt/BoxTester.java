package lv.rvt;

public class BoxTester {
    public static void main(String[] args) {
        Box box = new Box(2.5, 5.0, 6.0);
        System.out.println("Original Box:");
        System.out.println("Length: " + box.length());
        System.out.println("Height: " + box.height());
        System.out.println("Width: " + box.width());
        System.out.println("Area: " + box.area() + " Volume: " + box.volume());


        Box box2 = new Box(box);
        System.out.println("\nCopied Box:");
        System.out.println("Length: " + box2.length());
        System.out.println("Height: " + box2.height());
        System.out.println("Width: " + box2.width());
        System.out.println("Area: " + box2.area() + " Volume: " + box2.volume());

        System.out.println("Box == Box2: " + (box == box2));
    }
}
