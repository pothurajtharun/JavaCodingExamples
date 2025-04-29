package array.manipulations;

import java.util.*;

public class FindDuplicate {
  public static void main(String[] args) {
    int[] arr = {1, 3, 4, 2, 2};

    Set<Integer> seen = new HashSet<>();
    for (int num : arr) {
      if (!seen.add(num)) {
        System.out.println("Duplicate number: " + num);
        return;
      }
    }

    System.out.println("No duplicates found.");
  }
}