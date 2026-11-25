
package minicomputer;

public class CPU {

    private String model;
    private int numberOfCores;
    private double clockSpeed;

    private int accumulator;
    private int programCounter;

    public CPU(String model, int numberOfCores, double clockSpeed) {
        this.model = model;
        this.numberOfCores = numberOfCores;
        this.clockSpeed = clockSpeed;

        this.accumulator = 0;
        this.programCounter = 0;
    }

 
    public void displaySpecifications() {
        System.out.println("CPU Model: " + model);
        System.out.println("Number of Cores: " + numberOfCores);
        System.out.println("Clock Speed: " + clockSpeed + " GHz");
    }

 
    public void resetRegisters() {
        accumulator = 0;
        programCounter = 0;
    }
    public String getModel() {
        return model;
    }
    public int getNumberOfCores() {
        return numberOfCores;
    }
    public double getClockSpeed() {
        return clockSpeed;
    }

}
