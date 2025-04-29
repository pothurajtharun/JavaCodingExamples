package string.manipulations;

public class WordCounter {
  public static int countWords(String sentence) {
    if (sentence == null || sentence.trim().isEmpty())
      return 0;
    return sentence.trim().split("\\s+").length;
  }

  public static void main(String[] args) {
    String text = "   Java is a powerful language  ";
    System.out.println("Word count: " + countWords(text));
  }
}
