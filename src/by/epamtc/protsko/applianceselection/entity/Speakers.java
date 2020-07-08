package by.epamtc.protsko.applianceselection.entity;

public class Speakers implements Appliance {

    private double powerConsumption;
    private double numberOfSpeakers;
    private String frequencyRange;
    private double cordLength;


    public Speakers() {
    }

    public Speakers(String[] speakersCharacteristic) {
        for (int i = 0; i < speakersCharacteristic.length; ) {
            this.powerConsumption = Double.parseDouble(speakersCharacteristic[i++]);
            this.numberOfSpeakers = Double.parseDouble(speakersCharacteristic[i++]);
            this.frequencyRange = speakersCharacteristic[i++];
            this.cordLength = Double.parseDouble(speakersCharacteristic[i++]);
        }
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public double getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(double numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public double getCordLength() {
        return cordLength;
    }

    public void setCordLength(double cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public String toString() {
        return "Speakers:  " +
                "Power_Consumption=" + powerConsumption +
                ", Number_Of_Speakers=" + numberOfSpeakers +
                ", Frequency_Range=" + frequencyRange +
                ", Cord_Length=" + cordLength +
                ';';
    }
}


