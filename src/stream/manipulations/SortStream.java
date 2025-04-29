package stream.manipulations;

import java.util.Arrays;

public class SortStream {
  public static void main(String[] args) {
    int[] arr = {9, 3, 7, 1, 4};

    int[] sorted = Arrays.stream(arr)
        .sorted()
        .toArray();

    System.out.println("Sorted array: " + Arrays.toString(sorted));
  }
}

