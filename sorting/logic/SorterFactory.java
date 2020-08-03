package sorting.logic;

import sorting.sorters.Sorter;
import sorting.sorters.countsorters.CountLineSorter;
import sorting.sorters.countsorters.CountLongSorter;
import sorting.sorters.countsorters.CountWordSorter;
import sorting.sorters.naturalsorters.NatLineSorter;
import sorting.sorters.naturalsorters.NatLongSorter;
import sorting.sorters.naturalsorters.NatWordSorter;

public class SorterFactory {
    public static Sorter parseDataType(String sortingType, String dataType) {
        if (sortingType.equals("natural")) {
            switch (dataType) {
                case "long":
                    return new NatLongSorter();
                case "line":
                    return new NatLineSorter();
                default:
                    return new NatWordSorter();
            }
        } else if (sortingType.equals("byCount")) {
            switch (dataType) {
                case "long":
                    return new CountLongSorter();
                case "line":
                    return new CountLineSorter();
                default:
                    return new CountWordSorter();
            }
        }
        return new NatWordSorter();
    }
}
