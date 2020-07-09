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

    public String getOperationSystem() {
        return operationSystem;
    }

    public double getMemoryRom() {
        return memoryRom;
    }

    public double getSystemMemory() {
        return systemMemory;
    }

    public double getCpu() {
        return cpu;
    }

    public double getDisplayInches() {
        return displayInches;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop)) return false;

        Laptop laptop = (Laptop) o;

        if (Double.compare(laptop.batteryCapacity, batteryCapacity) != 0) return false;
        if (Double.compare(laptop.memoryRom, memoryRom) != 0) return false;
        if (Double.compare(laptop.systemMemory, systemMemory) != 0) return false;
        if (Double.compare(laptop.cpu, cpu) != 0) return false;
        if (Double.compare(laptop.displayInches, displayInches) != 0) return false;
        return operationSystem != null ? operationSystem.equals(laptop.operationSystem) : laptop.operationSystem == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(batteryCapacity);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (operationSystem != null ? operationSystem.hashCode() : 0);
        temp = Double.doubleToLongBits(memoryRom);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(systemMemory);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(cpu);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(displayInches);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
