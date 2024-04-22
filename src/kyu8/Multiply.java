package kyu8;


/**
 * Given a buggy code to multiply two longs,
 * Kata requires one to fix the bug
 * <p>
 * RCA: Missing semi-colon at the end of statement;
 * <p>
 * Category: Bugs
 * https://www.codewars.com/kata/50654ddff44f800200000004
 */
public class Multiply {

    public static void main(String[] args) {

        System.out.println(multiply(1.0, 1.0));
        System.out.println(multiply(2.0, 1.0));
    }

    static Double multiply(Double a, Double b) {
        return a * b;
    }
}
