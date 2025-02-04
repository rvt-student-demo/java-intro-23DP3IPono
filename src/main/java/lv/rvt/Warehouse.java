package lv.rvt;

public class Warehouse {
    private double capacity;
    private double balance;

    public Warehouse(double capacity) {
        if (capacity > 0) {
            this.capacity = capacity;
        } else {
            this.capacity = 0;
        }
        this.balance = 0;
    }

    public double getBalance() {
        return balance;
    }

    public double getCapacity() {
        return capacity;
    }

    public double howMuchSpaceLeft() {
        return capacity - balance;
    }

    public void addToWarehouse(double amount) {
        if (amount > 0) {
            balance += amount;
            if (balance > capacity) {
                balance = capacity;
            }
        }
    }

    public double takeFromWarehouse(double amount) {
        if (amount < 0) {
            return 0;
        }
        if (amount > balance) {
            double all = balance;
            balance = 0;
            return all;
        }
        balance -= amount;
        return amount;
    }

    public String toString() {
        return "balance = " + (Math.round(balance * 10) / 10.0) + ", space left " + (Math.round(howMuchSpaceLeft() * 10) / 10.0);
    }

}
