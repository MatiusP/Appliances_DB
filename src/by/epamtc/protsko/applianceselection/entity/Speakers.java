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

    public double getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public double getCordLength() {
        return cordLength;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Speakers)) return false;

        Speakers speakers = (Speakers) o;

        if (Double.compare(speakers.powerConsumption, powerConsumption) != 0) return false;
        if (Double.compare(speakers.numberOfSpeakers, numberOfSpeakers) != 0) return false;
        if (Double.compare(speakers.cordLength, cordLength) != 0) return false;
        return frequencyRange != null ? frequencyRange.equals(speakers.frequencyRange) : speakers.frequencyRange == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(powerConsumption);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(numberOfSpeakers);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (frequencyRange != null ? frequencyRange.hashCode() : 0);
        temp = Double.doubleToLongBits(cordLength);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}


