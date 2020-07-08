package by.epamtc.protsko.applianceselection.entity;

public class TabletPC implements Appliance {

    private double batteryCapacity;
    private double displayInches;
    private double memoryRom;
    private double flashMemoryCapacity;
    private String color;

    public TabletPC() {
    }

    public TabletPC(String[] tabletPCCharacteristic) {
        for (int i = 0; i < tabletPCCharacteristic.length; ) {
            this.batteryCapacity = Double.parseDouble(tabletPCCharacteristic[i++]);
            this.displayInches = Double.parseDouble(tabletPCCharacteristic[i++]);
            this.memoryRom = Double.parseDouble(tabletPCCharacteristic[i++]);
            this.flashMemoryCapacity = Double.parseDouble(tabletPCCharacteristic[i++]);
            this.color = tabletPCCharacteristic[i++];
        }
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    public double getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(double memoryRom) {
        this.memoryRom = memoryRom;
    }

    public double getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(double flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "TabletPC:  " +
                "Battery_Capacity=" + batteryCapacity +
                ", Display_Inches=" + displayInches +
                ", Memory_Rom=" + memoryRom +
                ", Flash_Memory_Capacity=" + flashMemoryCapacity +
                ", Color=" + color +
                ';';
    }
}
