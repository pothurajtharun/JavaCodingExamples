package string.manipulations;

public class PalindromeCheck {
  public static boolean isPalindrome(String input) {
    input = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    int start = 0, end = input.length() - 1;
    while (start < end) {
      if (input.charAt(start++) != input.charAt(end--)) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(isPalindrome("A man, a plan, a canal, Panama")); // true
  }
}
