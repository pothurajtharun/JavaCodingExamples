package string.manipulations;

// Question: Write a method to reverse a string without using StringBuilder or StringBuffer.

public class ReverseString {
    public static String reverseString(String input) {
        char[] chars = input.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println("Reversed: " + reverseString("hello"));
    }
}
