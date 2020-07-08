package by.epamtc.protsko.applianceselection.entity;

public class Laptop implements Appliance {

    private double batteryCapacity;
    private String operationSystem;
    private double memoryRom;
    private double systemMemory;
    private double cpu;
    private double displayInches;


    public Laptop() {
    }

    public Laptop(String[] laptopCharacteristic) {
        for (int i = 0; i < laptopCharacteristic.length; i++) {
            this.batteryCapacity = Double.parseDouble(laptopCharacteristic[i++]);
            this.operationSystem = laptopCharacteristic[i++];
            this.memoryRom = Double.parseDouble(laptopCharacteristic[i++]);
            this.systemMemory = Double.parseDouble(laptopCharacteristic[i++]);
            this.cpu = Double.parseDouble(laptopCharacteristic[i++]);
            this.displayInches = Double.parseDouble(laptopCharacteristic[i++]);
        }
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public double getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(double memoryRom) {
        this.memoryRom = memoryRom;
    }

    public double getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(double systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    @Override
    public String toString() {
        return "Laptop:  " +
                "Battery_Capacity=" + batteryCapacity +
                ", OS=" + operationSystem +
                ", Memory_Rom=" + memoryRom +
                ", System_Memory=" + systemMemory +
                ", CPU=" + cpu +
                ", Display_Inches=" + displayInches +
                ';';
    }
}
