package lv.rvt;

public class ProductWarehouse extends Warehouse {
    private String productName;

    public ProductWarehouse(String productName, double capacity) {
        super(capacity);
        this.productName = productName;
    }

    public String getName() {
        return productName;
    }

    public void setName(String newName) {
        this.productName = newName;
    }

    public String toString() {
        return productName + ": " + super.toString();
    }
 
    public static void main(String[] args) {
        ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
        juice.addToWarehouse(1000.0);
        juice.takeFromWarehouse(11.3);

        System.out.println(juice.getName());

        juice.addToWarehouse(1.0);
        System.out.println(juice);
    }

}
