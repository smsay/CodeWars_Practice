package kyu8;


import java.util.Arrays;

/*
Calculate average

Write a function which calculates the average of the numbers in a given list.

Note: Empty arrays should return 0.

Categories : Fundamentals, Functional Programming, Declarative Programming

 */
public class AverageOfList {

    public static double average2(int[] arr) {

        if (arr.length == 0)
            return 0;
        else {
            int sum = 0;
            for (int each : arr) {
                sum += each;
            }
            return sum / arr.length;

        }
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        System.out.println(average2(arr));
    }

}