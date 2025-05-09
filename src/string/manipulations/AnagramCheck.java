package string.manipulations;

import java.util.*;

//Example: "listen" & "silent" → true

public class AnagramCheck {
    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1, c2);
    }

    public static void main(String[] args) {
        System.out.println("Are anagrams: " + areAnagrams("listen", "silent"));
    }
}
