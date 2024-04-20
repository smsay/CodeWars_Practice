package kyu8;


import java.util.Arrays;

/*
Sum Arrays

Write a function that takes an array of numbers and returns the sum of the numbers.
The numbers can be negative or non-integer.
If the array does not contain any numbers then you should return 0.
Examples

Input: [1, 5.2, 4, 0, -1]
Output: 9.2

Input: []
Output: 0

Input: [-2.398]
Output: -2.398

Assumptions
    You can assume that you are only given numbers.
    You cannot assume the size of the array.
    You can assume that you do get an array and if the array is empty, return 0.

Tests expect accuracy of 1e-4.

What We're Testing
We're testing basic loops and math operations.
This is for beginners who are just learning loops and math operations.
Advanced users may find this extremely easy and can easily write this in one line.

Categories : Fundamentals, Loops, Control Flow, Basic Language Features, Arrays
 */
public class SumArray {

    public static void main(String[] args) {

        var arr1 = new double[]{1, 5.2, 4, 0, -1};
        var arr2 = new double[]{};
        var arr3 = new double[]{-2.398};

        System.out.println(YevgeniySolutionSumArray(0, 0, arr1));
        System.out.println(YevgeniySolutionSumArray(0, 0, arr2));
        System.out.println(YevgeniySolutionSumArray(0, 0, arr3));
        System.out.println(YevgeniySolutionSumArray2(arr1));
        System.out.println(YevgeniySolutionSumArray2(arr2));
        System.out.println(YevgeniySolutionSumArray2(arr3));
    }

    static double YevgeniySolutionSumArray(int i, double sum, double[] array) {

        if (array.length == 0) return sum;
        if (i == array.length) return sum;

        return YevgeniySolutionSumArray(i + 1, sum + array[i], array);
    }

    static double YevgeniySolutionSumArray2(double[] array) {
        if (array.length == 0) return 0;
        if (array.length == 1) return array[0];

        return array[0] + YevgeniySolutionSumArray2(Arrays.copyOfRange(array, 1, array.length));
    }

}