package sorting.sorters.naturalsorters;

import sorting.sorters.Sorter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NatLongSorter extends Sorter{
    List<Long> numbers;

    public NatLongSorter() {
        this.numbers = new ArrayList<>();
    }

    @Override
    public void read() {
        while (scanner.hasNext()) {
            count++;
            add(scanner.next());
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

    private void add(String element) {
        try {
            Long longElem = Long.parseLong(element);
            numbers.add(longElem);
        } catch (NumberFormatException e) {
            System.out.println("\"" + element +
                    "\" isn't a long. It's skipped.");
        }
    }

    @Override
    public void sort() {
        Collections.sort(numbers);
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder("Total numbers: " + count + ".\n" +
                "Sorted data: ");
        for (int i = 0; i < numbers.size(); i++) {
            if (i == (numbers.size() - 1)) {
                output.append(numbers.get(i));
            } else {
                output.append(numbers.get(i)).append(" ");
            }
        }
        return output.toString();
    }
}
