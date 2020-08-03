//package sorting.sorters;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class WordSorter extends Sorter {
//    private String longestWord;
//    private int longestWordCount;
//    private double percentage;
//    private List<String> words;
//
//    public WordSorter() {
//        longestWordCount = 0;
//        longestWord = "";
//        words = new ArrayList<>();
//    }
//
//    @Override
//    public void read() {
//        while (scanner.hasNext()) {
//            count++;
//            words.add(scanner.next());
//        }
//    }
//
//    @Override
//    public void sort() {
//        longestWord = words.get(0);
//        for (String s : words) {
//            if (s.length() > longestWord.length()) {
//                longestWord = s;
//                longestWordCount = 1;
//            } else if (s.length() == longestWord.length()) {
//                longestWordCount++;
//            }
//        }
//        percentage = (double) longestWordCount / count * 100;
//    }
//
//    @Override
//    public String toString() {
//        String percent = String.format("%.0f", percentage);
//        return "Total words: " + count + ".\nThe longest word: "
//                + longestWord + " (" + longestWordCount + " time(s), " + percent + "%).";
//    }
//}
