package sorting.sorters.naturalsorters;

import sorting.sorters.Sorter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NatLineSorter extends Sorter {
    private List<String> lines;

    public NatLineSorter() {
        lines = new ArrayList<>();
    }

    @Override
    public void read() {
        while (scanner.hasNextLine()) {
            count++;
            lines.add(scanner.nextLine());
        }
    }

    @Override
    public void readFile(String filePath) {
        File file = new File(filePath);
        try (Scanner fileReader = new Scanner(file)) {
            while (fileReader.hasNextLine()) {
                lines.add(fileReader.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void sort() {
        Collections.sort(lines);
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder("Total lines: " + count + ".\n" +
                "Sorted data:\n");
        for (int i = 0; i < lines.size(); i++) {
            if (i == (lines.size() - 1)) {
                output.append(lines.get(i));
            } else {
                output.append(lines.get(i)).append("\n");
            }
        }
        return output.toString();
    }
}
