//package sorting.sorters;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class LongSorter extends Sorter {
//    private List<Long> numbers;
//    private long greatestNumber;
//    private int greatestNumberCount;
//    private double percentage;
//
//    public LongSorter() {
//        numbers = new ArrayList<>();
//        greatestNumberCount = 0;
//    }
//
//    @Override
//    public void read() {
//        while (scanner.hasNextLong()) {
//            count++;
//            numbers.add(scanner.nextLong());
//        }
//    }
//
//    @Override
//    public void sort() {
//        greatestNumber = numbers.get(0);
//        for (Long number : numbers) {
//            if (number > greatestNumber) {
//                greatestNumberCount = 1;
//                greatestNumber = number;
//            } else if (number == greatestNumber) {
//                greatestNumberCount++;
//            }
//        }
//        percentage = (double) greatestNumberCount / count * 100;
//    }
//
//    @Override
//    public String toString() {
//        return "Total numbers: " + count + ".\n" +
//                "The greatest number: " + greatestNumber + " (" + greatestNumberCount +
//                " time(s), " + String.format("%.0f", percentage) + "%).";
//    }
//}
