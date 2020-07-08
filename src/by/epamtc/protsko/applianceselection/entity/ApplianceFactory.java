package by.epamtc.protsko.applianceselection.entity;

public class ApplianceFactory {

    public Appliance getAppliance(String applianceType, String[] characteristic) {
        Appliance appliance;

        switch (applianceType) {
            case "Laptop":
                appliance = new Laptop(characteristic);
                break;
            case "Oven":
                appliance = new Oven(characteristic);
                break;
            case "Refrigerator":
                appliance = new Refrigerator(characteristic);
                break;
            case "Speakers":
                appliance = new Speakers(characteristic);
                break;
            case "TabletPC":
                appliance = new TabletPC(characteristic);
                break;
            case "VacuumCleaner":
                appliance = new VacuumCleaner(characteristic);
                break;
            default:
                throw new IllegalArgumentException("Wrong appliance type:" + applianceType);
        }
        return appliance;
    }
}
