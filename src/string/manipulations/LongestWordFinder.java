package string.manipulations;

public class LongestWordFinder {
  public static String findLongestWord(String sentence) {
    String[] words = sentence.split("\\s+");
    String longest = "";
    for (String word : words) {
      if (word.length() > longest.length()) {
        longest = word;
      }
    }
    return longest;
  }

  public static void main(String[] args) {
    String input = "Java is an object-oriented programming language";
    System.out.println("Longest word: " + findLongestWord(input));
  }
}

