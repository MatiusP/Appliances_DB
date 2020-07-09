package by.epamtc.protsko.applianceselection.entity;

public class VacuumCleaner implements Appliance {

    private double powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private double motorSpeedRegulation;
    private double cleaningWidth;

    public VacuumCleaner() {
    }

    public VacuumCleaner(String[] vacuumCleanerCharacteristic) {
        for (int i = 0; i < vacuumCleanerCharacteristic.length; ) {
            this.powerConsumption = Double.parseDouble(vacuumCleanerCharacteristic[i++]);
            this.filterType = vacuumCleanerCharacteristic[i++];
            this.bagType = vacuumCleanerCharacteristic[i++];
            this.wandType = vacuumCleanerCharacteristic[i++];
            this.motorSpeedRegulation = Double.parseDouble(vacuumCleanerCharacteristic[i++]);
            this.cleaningWidth = Double.parseDouble(vacuumCleanerCharacteristic[i++]);
        }
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public String getFilterType() {
        return filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public double getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public double getCleaningWidth() {
        return cleaningWidth;
    }

    @Override
    public String toString() {
        return "VacuumCleaner:  " +
                "Power_Consumption=" + powerConsumption +
                ", Filter_Type=" + filterType +
                ", Bag_Type=" + bagType +
                ", Wand_Type=" + wandType +
                ", Motor_Speed_Regulation=" + motorSpeedRegulation +
                ", Cleaning_Width=" + cleaningWidth +
                ';';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VacuumCleaner)) return false;

        VacuumCleaner that = (VacuumCleaner) o;

        if (Double.compare(that.powerConsumption, powerConsumption) != 0) return false;
        if (Double.compare(that.motorSpeedRegulation, motorSpeedRegulation) != 0) return false;
        if (Double.compare(that.cleaningWidth, cleaningWidth) != 0) return false;
        if (filterType != null ? !filterType.equals(that.filterType) : that.filterType != null) return false;
        if (bagType != null ? !bagType.equals(that.bagType) : that.bagType != null) return false;
        return wandType != null ? wandType.equals(that.wandType) : that.wandType == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(powerConsumption);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (filterType != null ? filterType.hashCode() : 0);
        result = 31 * result + (bagType != null ? bagType.hashCode() : 0);
        result = 31 * result + (wandType != null ? wandType.hashCode() : 0);
        temp = Double.doubleToLongBits(motorSpeedRegulation);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(cleaningWidth);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
