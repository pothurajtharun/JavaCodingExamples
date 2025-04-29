package string.manipulations;

public class OnlyDigits {
  public static boolean isNumeric(String input) {
    return input.matches("\\d+");
  }

  public static void main(String[] args) {
    System.out.println(isNumeric("123456")); // true
    System.out.println(isNumeric("12a45"));  // false
  }
}
