package array.manipulations;

import java.util.*;

public class FindPairs {
  public static void main(String[] args) {
    int[] arr = {2, 4, 3, 5, 7, 8, 9};
    int target = 10;

    Set<Integer> seen = new HashSet<>();

    for (int num : arr) {
      int complement = target - num;
      if (seen.contains(complement)) {
        System.out.println("Pair: (" + complement + ", " + num + ")");
      }
      seen.add(num);
    }
  }
}

