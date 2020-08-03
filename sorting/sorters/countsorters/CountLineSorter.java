package sorting.sorters.countsorters;

import sorting.sorters.Sorter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

public class CountLineSorter extends Sorter {
    List<String> valsList;
    Map<String, Integer> valsMap;
    Map<String, Integer> sortedMap;
    double percent;

    public CountLineSorter() {
        valsList = new ArrayList<>();
        valsMap = new TreeMap<>();
        sortedMap = new TreeMap<>();
    }

    @Override
    public void read() {
        while (scanner.hasNextLine()) {
            count++;
            valsList.add(scanner.nextLine());
        }
        for (String line : valsList) {
            valsMap.put(line, getFrequency(line));
        }
    }

    @Override
    public void readFile(String filePath) {
        File file = new File(filePath);
        try (Scanner fileReader = new Scanner(file)) {
            while (fileReader.hasNextLine()) {
                valsList.add(fileReader.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public int getFrequency(String elem) {
        int count = 0;
        for (String line : valsList) {
            if (elem.equals(line)) {
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
        return "Total lines: " + count + ".\n" +
                linesOutput();
    }
}
