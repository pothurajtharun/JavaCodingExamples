package string.manipulations;

import java.util.*;

// Example: "aabbccdfe" → 'd'

public class FirstNonRepeated {
    public static char firstNonRepeatedChar(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) return entry.getKey();
        }
        return '_';
    }

    public static void main(String[] args) {
        System.out.println("First non-repeated character: " + firstNonRepeatedChar("aabbccdfe"));
    }
}
