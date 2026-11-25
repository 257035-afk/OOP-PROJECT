
package minicomputer;

public class Computer {

    private String computerName;
    private CPU cpu;
    private RAM ram;
    private Storage storage;
    private boolean powerOn;

    public Computer(String computerName, CPU cpu, RAM ram, Storage storage) {

        this.computerName = computerName;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.powerOn = false;
    }

    public void powerOn() {

        powerOn = true;

        System.out.println("Computer is ON");
    }
  
    public void shutDown() {

        powerOn = false;

        System.out.println("Computer is OFF");
    }

    public void displayPowerStatus() {

        if (powerOn) {
            System.out.println("Power Status: ON");
        } else {
            System.out.println("Power Status: OFF");
        }
    }


    public void displaySpecifications() {

        System.out.println("Computer Name: " + computerName);

        System.out.println("---------- CPU ----------");
        cpu.displaySpecifications();

        System.out.println("---------- RAM ----------");
        ram.displayMemory();

        System.out.println("---------- Storage ----------");
        storage.displaySpecifications();

        displayPowerStatus();
    }


    public RAM getRAM() {
        return ram;
    }

    
    public CPU getCPU() {
        return cpu;
    }

    
    public Storage getStorage() {
        return storage;
    }
}
