package by.epamtc.protsko.applianceselection.logic;

class LineParser {

    private static String[] parseString(String line) {
        String lineForParse = line.substring(line.indexOf(":") + 1).replaceAll("[;\\s]+", "");

        return lineForParse.split(",");
    }

    static String[] applianceCharacteristics(String line) {
        String[] parsedString = parseString(line);
        String[] characteristics = new String[parsedString.length];

        for (int i = 0; i < characteristics.length; i++) {
            characteristics[i] = parsedString[i].substring(parsedString[i].indexOf("=") + 1);
        }
        return characteristics;
    }
}
