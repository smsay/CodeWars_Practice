package kyu8;


import java.util.Arrays;

/*
Invert values

Given a set of numbers, return the additive inverse of each.
Each positive becomes negatives, and the negatives become positives.

invert([1,2,3,4,5]) == [-1,-2,-3,-4,-5]
invert([1,-2,3,-4,5]) == [-1,2,-3,4,-5]
invert([]) == []

Categories : Fundamentals, Integers, Numbers, Lists, Data Structures

 */
public class InvertValues {

    public static void main(String[] args) {

        var arr = new int[]{1, 2, 3, 4, 5};
        YevgeniySolutionInvertValues(arr);
        System.out.println(Arrays.toString(arr));
        var arr2 = new int[]{1, -2, 3, -4, 5};
        YevgeniySolutionInvertValues(arr2);
        System.out.println(Arrays.toString(arr2));
        var arr3 = new int[]{};
        YevgeniySolutionInvertValues(arr3);
        System.out.println(Arrays.toString(arr3));
    }

    static void YevgeniySolutionInvertValues(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) arr[i] = Math.abs(arr[i]);
            else arr[i] = -arr[i];

        }
    }
}