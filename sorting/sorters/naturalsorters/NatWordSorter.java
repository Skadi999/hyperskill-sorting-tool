package sorting.sorters.naturalsorters;

import sorting.sorters.Sorter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NatWordSorter extends Sorter {
    private List<String> words;

    public NatWordSorter() {
        words = new ArrayList<>();
    }

    @Override
    public void read() {
        while (scanner.hasNext()) {
            count++;
            words.add(scanner.next());
        }
    }

    @Override
    public void readFile(String filePath) {
        File file = new File(filePath);
        try (Scanner fileReader = new Scanner(file)) {
            while (fileReader.hasNextLine()) {
                words.add(fileReader.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void sort() {
        Collections.sort(words);
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder("Total words: " + count + ".\n" +
                "Sorted data: ");
        for (int i = 0; i < words.size(); i++) {
            if (i == (words.size() - 1)) {
                output.append(words.get(i));
            } else {
                output.append(words.get(i)).append(" ");
            }
        }
        return output.toString();
    }
}
