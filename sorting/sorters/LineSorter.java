//package sorting.sorters;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class LineSorter extends Sorter {
//    private String longestLine;
//    private int longestLineCount;
//    private double percentage;
//    private List<String> lines;
//
//    public LineSorter() {
//        longestLineCount = 0;
//        longestLine = "";
//        lines = new ArrayList<>();
//    }
//
//    @Override
//    public void read() {
//        while (scanner.hasNextLine()) {
//            count++;
//            lines.add(scanner.nextLine());
//        }
//    }
//
//    @Override
//    public void sort() {
//        longestLine = lines.get(0);
//        for (String s : lines) {
//            if (s.length() > longestLine.length()) {
//                longestLine = s;
//                longestLineCount = 1;
//            } else if (s.length() == longestLine.length()) {
//                longestLineCount++;
//            }
//        }
//        percentage = (double) longestLineCount / count * 100;
//    }
//
//    @Override
//    public String toString() {
//        return "Total lines: " + count + ".\n" +
//                "The longest line: \n" + longestLine + "\n(" + longestLineCount +
//                " time(s), " + String.format("%.0f", percentage) + "%).";
//    }
//}
