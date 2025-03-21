// Name: John Kerstetter
// Class: CS 240
// Assignment: Lab 2 - Character Count
// File: CharCount.java

import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter string: ");
        String inputString = input.nextLine();

        System.out.print("Enter char: ");
        char inputChar = input.next().charAt(0);

        int c = count(inputString.toCharArray(), inputChar);
        System.out.println("Counted chars: " + c);

        input.close();
    }

    // counts amount of times ch appears in chars
    public static int count(char[] chars, char ch) {
        return count(chars, ch, 0);
    }

    // helper method
    private static int count(char[] chars, char ch, int high) {
        if (high >= chars.length) {
            
            // end of string
            return 0;

        } else if (chars[high] == ch) {
            
            // char matches
            return count(chars, ch, high + 1) + 1;

        } else {

            // no match
            return count(chars, ch, high + 1);
        
        }
    }
}
