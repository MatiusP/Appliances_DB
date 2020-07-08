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

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public double getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(double motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public double getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(double cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
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
}
