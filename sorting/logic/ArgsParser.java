package sorting.logic;

public class ArgsParser {
    private String dataType;
    private String sortingType;
    private String inputFile;
    private String outputFile;
    private String[] args;

    //todo TRY to make the args an enum
    ArgsParser(String[] args) {
        dataType = "word";
        sortingType = "natural";
        inputFile = "";
        outputFile = "";
        this.args = args;
    }

    public void parseArgs() {
        for (int i = 0; i < args.length; i++) {
            if (args[i].charAt(0) == '-' && i != (args.length - 1)) {
                parseArg(args[i], args[i + 1]);
            }
        }
    }

    public void parseArg(String arg, String argValue) {
        switch (arg) {
            case "-dataType":
                dataType = argValue;
                break;
            case "-sortingType":
                sortingType = argValue;
                break;
            case "-inputFile":
                inputFile = argValue;
                break;
            case "-outputFile":
                outputFile = argValue;
                break;
            default:
                System.out.printf("\"%s\" isn't a valid parameter. It's skipped.\n", arg);
                break;
        }
    }

    public void checkArgs() {
        if (dataType.isEmpty()) {
            System.out.println("No data type defined!");
        }
        if (sortingType.isEmpty()) {
            System.out.println("No sorting type defined!");
        }
    }

    public String getDataType() {
        return dataType;
    }

    public String getSortingType() {
        return sortingType;
    }

    public String getInputFile() {
        return inputFile;
    }

    public String getOutputFile() {
        return outputFile;
    }
}
