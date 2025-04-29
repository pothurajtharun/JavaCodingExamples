package stream.manipulations;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class MinMaxStream {
  public static void main(String[] args) {
    int[] arr = {5, 10, 3, 7, 1};

    OptionalInt min = IntStream.of(arr).min();
    OptionalInt max = IntStream.of(arr).max();

    min.ifPresent(m -> System.out.println("Min: " + m));
    max.ifPresent(m -> System.out.println("Max: " + m));
  }
}

