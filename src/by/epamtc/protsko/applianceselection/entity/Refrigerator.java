package by.epamtc.protsko.applianceselection.entity;

public class Refrigerator implements Appliance {

    private double powerConsumption;
    private double weight;
    private double freezerCapacity;
    private double overallCapacity;
    private double height;
    private double width;

    public Refrigerator() {
    }

    public Refrigerator(String[] RefrigeratorCharacteristic) {
        for (int i = 0; i < RefrigeratorCharacteristic.length; ) {
            this.powerConsumption = Double.parseDouble(RefrigeratorCharacteristic[i++]);
            this.weight = Double.parseDouble(RefrigeratorCharacteristic[i++]);
            this.freezerCapacity = Double.parseDouble(RefrigeratorCharacteristic[i++]);
            this.overallCapacity = Double.parseDouble(RefrigeratorCharacteristic[i++]);
            this.height = Double.parseDouble(RefrigeratorCharacteristic[i++]);
            this.width = Double.parseDouble(RefrigeratorCharacteristic[i++]);
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

    public double getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(double freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public double getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
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
        return "Refrigerator:  " +
                "Power_Consumption=" + powerConsumption +
                ", Weight=" + weight +
                ", Freezer_Capacity=" + freezerCapacity +
                ", Overall_Capacity=" + overallCapacity +
                ", Height=" + height +
                ", Width=" + width +
                ';';
    }
}
