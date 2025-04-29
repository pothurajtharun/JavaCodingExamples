package stream.manipulations;

import java.util.stream.IntStream;

public class SumWithStreams {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};

    int sum = IntStream.of(arr).sum();

    System.out.println("Sum = " + sum);
  }
}

