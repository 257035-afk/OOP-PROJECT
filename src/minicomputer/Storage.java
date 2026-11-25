
package minicomputer;

public class Storage {

    private String deviceName;
    private int totalCapacity;
    private int usedCapacity;

    public Storage(String deviceName, int totalCapacity) {

        this.deviceName = deviceName;

        if (totalCapacity > 0) {
            this.totalCapacity = totalCapacity;
        } else {
            this.totalCapacity = 0;
            System.out.println("Invalid storage capacity");
        }

        this.usedCapacity = 0;
    }


    public void displaySpecifications() {
        System.out.println("Storage Name: " + deviceName);
        System.out.println("Total Capacity: " + totalCapacity + " GB");
        System.out.println("Used Capacity: " + usedCapacity + " GB");
        System.out.println("Available Space: " + getAvailableSpace() + " GB");
    }

    public int getAvailableSpace() {
        return totalCapacity - usedCapacity;
    }

    public boolean storeData(int amount) {

        if (amount <= 0) {
            return false;
        }

        if (amount > getAvailableSpace()) {
            return false;
        }

        usedCapacity = usedCapacity + amount;

        return true;
    }


    public boolean removeData(int amount) {

        if (amount <= 0) {
            return false;
        }

        if (amount > usedCapacity) {
            return false;
        }

        usedCapacity = usedCapacity - amount;

        return true;
    }
}
