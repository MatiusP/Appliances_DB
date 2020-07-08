package by.epamtc.protsko.applianceselection.main;

import static by.epamtc.protsko.applianceselection.logic.ApplianceListCreator.*;

public class Runner {

    public static void main(String[] args) {
        findAppliances("Laptop", "SYSTEM_MEMORY=1000");
        findAppliances("Refrigerator", "OVERALL_CAPACITY=300");
        findAppliances("TabletPC", "COLOR=blue");
    }
}
