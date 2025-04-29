package stream.manipulations;

import java.util.Arrays;

public class FilterEvenNumbers {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6};

    int[] evens = Arrays.stream(arr)
        .filter(num -> num % 2 == 0)
        .toArray();

    System.out.println("Even numbers: " + Arrays.toString(evens));
  }
}

