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

    public double getWeight() {
        return weight;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getDepth() {
        return depth;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Oven)) return false;

        Oven oven = (Oven) o;

        if (Double.compare(oven.powerConsumption, powerConsumption) != 0) return false;
        if (Double.compare(oven.weight, weight) != 0) return false;
        if (Double.compare(oven.capacity, capacity) != 0) return false;
        if (Double.compare(oven.depth, depth) != 0) return false;
        if (Double.compare(oven.height, height) != 0) return false;
        return Double.compare(oven.width, width) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(powerConsumption);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(capacity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(depth);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(width);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
