package kyu8;


import java.util.Arrays;

/*
What is between?

Complete the function that takes two integers (a, b, where a < b) and
return an array of all integers between the input parameters, including them.

For example:
a = 1
b = 4
--> [1, 2, 3, 4]

Categories : Fundamentals, Algorithms

 */
public class WhatIsInBetween {

    public static void main(String[] args) {

        var a = 2;
        var b = 7;

        System.out.println(Arrays.toString(YevgeniySolutionIsBetween(a, b)));
    }

    static int[] YevgeniySolutionIsBetween(int a, int b) {
        var result = new int[b];
        var i = 0;
        while (a <= b) {
            result[i++] = a++;
        }
        return Arrays.copyOf(result, i);
    }
}