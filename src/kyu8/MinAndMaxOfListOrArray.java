package kyu8;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/*
Find Maximum and Minimum Values of a List

Your task is to make two functions (max and min, or maximum and minimum, etc., depending on the language) 
that receive a list of integers as input and return, respectively, the largest and lowest number in that list.

Examples (Input -> Output)

* [4,6,2,1,9,63,-134,566]         -> max = 566, min = -134
* [-52, 56, 30, 29, -54, 0, -110] -> min = -110, max = 56
* [42, 54, 65, 87, 0]             -> min = 0, max = 87
* [5]                             -> min = 5, max = 5

Notes
    You may consider that there will not be any empty arrays/vectors.

Categories: Fundamentals, Basic Language Features
 */
public class MinAndMaxOfListOrArray {

    public static void main(String[] args) {

        var arr = new int[]{4, 6, 2, 1, 9, 63, -134, 566};
        var arr2 = new int[]{5};
        var arr3 = new int[]{42, 54, 65, 87, 0};
        YevgeniySolutionMaxMin(arr);
        YevgeniySolutionMaxMin(arr2);
        YevgeniySolutionMaxMin(arr3);
    }

    static void YevgeniySolutionMaxMin(int[] array) {
        System.out.print("max = " + Arrays.stream(array).max().getAsInt() + " ");
        System.out.println("min = " + Arrays.stream(array).min().getAsInt());

    }

}