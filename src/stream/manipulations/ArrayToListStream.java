package stream.manipulations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayToListStream {
  public static void main(String[] args) {
    String[] names = {"Alice", "Bob", "Charlie"};

    List<String> nameList = Arrays.stream(names)
        .collect(Collectors.toList());

    System.out.println("List: " + nameList);
  }
}

