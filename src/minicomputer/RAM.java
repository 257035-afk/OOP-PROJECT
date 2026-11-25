
package minicomputer;

public class RAM {

    private int totalCapacity;
    private int usedMemory;

    public RAM(int totalCapacity) {

        if (totalCapacity <= 0) {
           System.out.println("Invalid RAM capacity");
    return;
        }

        this.totalCapacity = totalCapacity;
        this.usedMemory = 0;
    }

    public void displayMemory() {
        System.out.println("Total RAM: " + totalCapacity + " MB");
        System.out.println("Used RAM: " + usedMemory + " MB");
        System.out.println("Available RAM: " + getAvailableMemory() + " MB");
    }


    public int getAvailableMemory() {
        return totalCapacity - usedMemory;
    }


    public boolean allocateMemory(int amount) {

        if (amount <= 0) {
            return false;
        }

        if (amount > getAvailableMemory()) {
            return false;
        }

        usedMemory += amount;
        return true;
    }

    public boolean releaseMemory(int amount) {

        if (amount <= 0) {
            return false;
        }

        if (amount > usedMemory) {
            return false;
        }

        usedMemory -= amount;
        return true;
    }
}
