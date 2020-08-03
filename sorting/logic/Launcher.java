package sorting.logic;

import sorting.sorters.Sorter;

public class Launcher {
    public static void launch(String[] args) {
        ArgsParser ap = new ArgsParser(args);
        ap.parseArgs();
        ap.checkArgs();
        Sorter sorter = SorterFactory.parseDataType
                (ap.getSortingType(), ap.getDataType());
        if (!ap.getInputFile().isEmpty()) {
            sorter.readFile(ap.getInputFile());
        } else {
            sorter.read();
        }
        sorter.sort();
        if (!ap.getOutputFile().isEmpty()) {
            sorter.writeToFile(ap.getOutputFile());
        } else {
            System.out.println(sorter.toString());
        }
    }
}
