package array.manipulations;

import java.util.*;

public class RemoveDuplicates {
  public static void main(String[] args) {
    int[] arr = {1, 3, 2, 3, 4, 1, 5};

    Set<Integer> set = new LinkedHashSet<>();
    for (int value : arr) {
      set.add(value);
    }

    System.out.println("Array after removing duplicates: " + set);
  }
}

