package sorting.sorters;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public abstract class Sorter {
    public int count;
    public Scanner scanner;

    public Sorter() {
        this.count = 0;
        scanner = new Scanner(System.in);
    }

    public void writeToFile(String filePath) {
        try (FileWriter fw = new FileWriter(filePath)) {
            fw.write(this.toString());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public abstract void read();

    public abstract void sort();

    public abstract void readFile(String filePath);

}
