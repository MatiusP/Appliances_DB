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

    public double getDisplayInches() {
        return displayInches;
    }

    public double getMemoryRom() {
        return memoryRom;
    }

    public double getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public String getColor() {
        return color;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TabletPC)) return false;

        TabletPC tabletPC = (TabletPC) o;

        if (Double.compare(tabletPC.batteryCapacity, batteryCapacity) != 0) return false;
        if (Double.compare(tabletPC.displayInches, displayInches) != 0) return false;
        if (Double.compare(tabletPC.memoryRom, memoryRom) != 0) return false;
        if (Double.compare(tabletPC.flashMemoryCapacity, flashMemoryCapacity) != 0) return false;
        return color != null ? color.equals(tabletPC.color) : tabletPC.color == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(batteryCapacity);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(displayInches);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(memoryRom);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(flashMemoryCapacity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }
}
