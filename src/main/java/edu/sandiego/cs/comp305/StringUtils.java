package edu.sandiego.cs.comp305;

import java.util.Scanner;

public final class StringUtils {
    private StringUtils() {

    }

    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        final String inputString = scanner.nextLine();

        final String reversed = reverseString(inputString);
        System.out.println(reversed);
    }

    public static String reverseString(final String inputString) {
        final char[] stringChars = inputString.toCharArray();
        int left = 0;
        int right = stringChars.length - 1;

        while (left < right) {
            final char temp = stringChars[left];
            stringChars[left] = stringChars[right];
            stringChars[right] = temp;
            left++;
            right--;
        }
        return new String(stringChars);
    }
}
