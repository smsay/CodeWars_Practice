package kyu8;


/**
 * We need a function that can transform a number into a string.
 * <p>
 * What ways of achieving this do you know?
 * <p>
 * Examples:
 * 123 --> "123"
 * 999 --> "999"
 * <p>
 * Categories: Fundamentals, Type Casting, Numbers, Strings
 * https://www.codewars.com/kata/5265326f5fda8eb1160004c8
 */
public class ConvertNumberToString {

    public static void main(String[] args) {

        var number = 123;
        System.out.println(YevgeniySolutionConvertNumberToString(number));
    }

    static String YevgeniySolutionConvertNumberToString(int number) {
        return String.valueOf(number);
    }
}
