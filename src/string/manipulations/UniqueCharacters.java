package string.manipulations;

// Constraints: No additional data structures allowed.
public class UniqueCharacters {
    public static boolean hasUniqueChars(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Has unique characters: " + hasUniqueChars("world"));
    }
}