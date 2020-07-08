package by.epamtc.protsko.applianceselection.logic;

import by.epamtc.protsko.applianceselection.entity.Appliance;
import by.epamtc.protsko.applianceselection.entity.ApplianceFactory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApplianceListCreator {
    private static final String FILE_NAME = "appliances_db.txt";
    private static List<Appliance> applianceList = new ArrayList<>();

    public static Appliance findAppliances(String applianceType, String characteristic) {
        Appliance currentAppliance = null;
        applianceList.clear();

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String currentLine;

            while ((currentLine = reader.readLine()) != null) {
                if (currentLine.contains(applianceType) && currentLine.contains(characteristic)) {
                    String[] applianceCharacteristic = LineParser.applianceCharacteristics(currentLine);
                    currentAppliance = new ApplianceFactory().getAppliance(applianceType, applianceCharacteristic);
                    applianceList.add(currentAppliance);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        applianceList();
        return currentAppliance;
    }

    private static void applianceList() {
        if (applianceList.size() > 0) {
            for (Appliance appliance : applianceList) {
                System.out.println(appliance);
            }
            return;
        }
        System.out.println("Appliances not found. Enter other characteristics.");
    }
}
