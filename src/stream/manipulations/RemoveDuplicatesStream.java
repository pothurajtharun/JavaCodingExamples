package stream.manipulations;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RemoveDuplicatesStream {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 2, 4, 1, 5};

    int[] result = IntStream.of(arr)
        .distinct()
        .toArray();

    System.out.println("Unique elements: " + Arrays.toString(result));
  }
}

