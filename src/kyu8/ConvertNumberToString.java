package kyu8;



/**
 * We need a function that can transform a number into a string.
 *
 * What ways of achieving this do you know?
 *
 * Examples:
 * 123 --> "123"
 * 999 --> "999"
 *
 * Categories: Fundamentals, Type Casting, Numbers, Strings
 * https://www.codewars.com/kata/5265326f5fda8eb1160004c8
 */
public class ConvertNumberToString {

    public static void main(String[] args) {
        System.out.println(convertString(123));
    }

    static String convertString(int number) {
        //return String.valueOf(number);
        return Integer.toString(number);
    }


}
