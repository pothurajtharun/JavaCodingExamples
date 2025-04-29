package array.manipulations;

public class MinMaxInArray {
  public static void main(String[] args) {
    int[] arr = {45, 3, 99, 12, 0, -5, 72};

    int min = arr[0];
    int max = arr[0];

    for (int num : arr) {
      if (num < min) min = num;
      if (num > max) max = num;
    }

    System.out.println("Min: " + min);
    System.out.println("Max: " + max);
  }
}

