package string.manipulations;

// Example: Input: "programming" → Output: "progamin"

public class RemoveDuplicates {
    public static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256];
        for (char c : str.toCharArray()) {
            if (!seen[c]) {
                seen[c] = true;
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println("After removing duplicates: " + removeDuplicates("programming"));
    }
}

//import java.util.LinkedHashSet;
//import java.util.Set;
//
//public class RemoveDuplicates {
//    public static String removeDuplicates(String input) {
//        Set<Character> seen = new LinkedHashSet<>();
//        for (char c : input.toCharArray()) {
//            seen.add(c);
//        }
//        StringBuilder sb = new StringBuilder();
//        for (Character c : seen) {
//            sb.append(c);
//        }
//        return sb.toString();
//    }
//
//    public static void main(String[] args) {
//        String input = "programming";
//        System.out.println("Unique: " + removeDuplicates(input));
//    }
//}
