package string.manipulations;

public class VowelConsonantCounter {
  public static void count(String input) {
    int vowels = 0, consonants = 0;
    input = input.toLowerCase().replaceAll("[^a-z]", "");

    for (char c : input.toCharArray()) {
      if ("aeiou".indexOf(c) != -1) {
        vowels++;
      } else {
        consonants++;
      }
    }
    System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
  }

  public static void main(String[] args) {
    count("Hello World!");
  }
}
