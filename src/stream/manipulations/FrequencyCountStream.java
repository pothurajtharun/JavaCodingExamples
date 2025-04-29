package stream.manipulations;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCountStream {
  public static void main(String[] args) {
    String[] input = {"apple", "banana", "apple", "orange", "banana", "apple"};

    Map<String, Long> frequencyMap = Arrays.stream(input)
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    System.out.println("Frequencies: " + frequencyMap);
  }
}

