package edu.sandiego.cs.comp305;

import java.util.Scanner;

public final class StringUtils {
    private StringUtils() {

    }

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = input.nextLine();

        String reversed = reverseString(inputString);
        System.out.println(reversed);
    }

    public static String reverseString(String inputString) {
        char[] stringChars = inputString.toCharArray();
        int left = 0;
        int right = stringChars.length - 1;

        while (left < right) {
            char temp = stringChars[left];
            stringChars[left] = stringChars[right];
            stringChars[right] = temp;
            left++;
            right--;
        }
        return new String(stringChars);
    }
}
