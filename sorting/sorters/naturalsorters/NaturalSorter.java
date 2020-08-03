//package sorting.sorters.naturalsorters;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.Scanner;
//
//public abstract class NaturalSorter<T extends Comparable<? super T>>{
//    Scanner scanner;
//    private T t;
//    List<T> elements;
//    private int count;
//
//    public NaturalSorter() {
//        scanner = new Scanner(System.in);
//        elements = new ArrayList<>();
//        count = 0;
//    }
//
//    public void sort() {
//        Collections.sort(elements);
//    }
//
//    public abstract void read();
//}
