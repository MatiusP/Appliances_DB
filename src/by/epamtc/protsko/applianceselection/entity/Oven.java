package by.epamtc.protsko.applianceselection.entity;

public class Oven implements Appliance {

    private double powerConsumption;
    private double weight;
    private double capacity;
    private double depth;
    private double height;
    private double width;

    public Oven() {
    }

    public Oven(String[] ovenCharacteristic) {
        for (int i = 0; i < ovenCharacteristic.length; ) {
            this.powerConsumption = Double.parseDouble(ovenCharacteristic[i++]);
            this.weight = Double.parseDouble(ovenCharacteristic[i++]);
            this.capacity = Double.parseDouble(ovenCharacteristic[i++]);
            this.depth = Double.parseDouble(ovenCharacteristic[i++]);
            this.height = Double.parseDouble(ovenCharacteristic[i++]);
            this.width = Double.parseDouble(ovenCharacteristic[i++]);
        }
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Oven:  " +
                "Power_Consumption=" + powerConsumption +
                ", Weight=" + weight +
                ", Capacity=" + capacity +
                ", Depth=" + depth +
                ", Height=" + height +
                ", Width=" + width +
                ';';
    }
}
