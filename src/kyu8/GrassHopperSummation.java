package kyu8;


/*
Grasshopper - Summation

Summation

Write a program that finds the summation of every number from 1 to num.
The number will always be a positive integer greater than 0.

For example:

summation(2) -> 3
#1 + 2

summation(8) -> 36
#1 + 2 + 3 + 4 + 5 + 6 + 7 + 8

Categories : Fundamentals, Loops, Control Flow, Basic Language Features
 */
public class GrassHopperSummation {

    public static void main(String[] args) {

        System.out.println(YevgeniySolutionSummation(2));
    }

    static int YevgeniySolutionSummation(int n) {
        if (n == 0) return n;
        if (n == 1) return 1;
        return n + YevgeniySolutionSummation(n - 1);
    }
}