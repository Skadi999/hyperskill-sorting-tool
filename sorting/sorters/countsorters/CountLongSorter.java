package sorting.sorters.countsorters;

import sorting.sorters.Sorter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

public class CountLongSorter extends Sorter {
    List<Long> valsList;
    Map<Long, Integer> valsMap;
    Map<Long, Integer> sortedMap;
    double percent;

    public CountLongSorter() {
        valsList = new ArrayList<>();
        valsMap = new HashMap<>();
        sortedMap = new HashMap<>();
    }

    @Override
    public void read() {
        while (scanner.hasNext()) {
            count++;
            String element = scanner.next();
            add(element);
        }
        for (long num : valsList) {
            valsMap.put(num, getFrequency(num));
        }
    }

    @Override
    public void readFile(String filePath) {
        File file = new File(filePath);
        try (Scanner fileReader = new Scanner(file)) {
            while (fileReader.hasNext()) {
                add(fileReader.next());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public void add(String element) {
        try {
            Long longElem = Long.parseLong(element);
            valsList.add(longElem);
        } catch (NumberFormatException e) {
            System.out.println("\"" + element +
                    "\" isn't a long. It's skipped.");
        }
    }

    public int getFrequency(long elem) {
        int count = 0;
        for (long num : valsList) {
            if (elem == num) {
                count++;
            }
        }
        return count;
    }

    @Override
    public void sort() {
        sortedMap = valsMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
    }

    public String linesOutput() {
        StringBuilder sb = new StringBuilder();
        for (var entry : sortedMap.entrySet()) {
            percent = (double) entry.getValue() / count * 100;
            String textPercent = String.format("%.0f", percent);
            sb.append(entry.getKey()).append(": ").append(entry.getValue())
                    .append(" time(s), ").append(textPercent).append("%\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "Total numbers: " + count + ".\n" +
                linesOutput();
    }
}
