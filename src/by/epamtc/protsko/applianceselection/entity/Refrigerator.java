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

    public double getWeight() {
        return weight;
    }

    public double getFreezerCapacity() {
        return freezerCapacity;
    }

    public double getOverallCapacity() {
        return overallCapacity;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Refrigerator)) return false;

        Refrigerator that = (Refrigerator) o;

        if (Double.compare(that.powerConsumption, powerConsumption) != 0) return false;
        if (Double.compare(that.weight, weight) != 0) return false;
        if (Double.compare(that.freezerCapacity, freezerCapacity) != 0) return false;
        if (Double.compare(that.overallCapacity, overallCapacity) != 0) return false;
        if (Double.compare(that.height, height) != 0) return false;
        return Double.compare(that.width, width) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(powerConsumption);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(freezerCapacity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(overallCapacity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(width);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
