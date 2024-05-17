package kyu8;

import java.util.Arrays;

/*
Count of positives / sum of negatives
Given an array of integers.

Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers. 0 is neither positive nor negative.

If the input array is empty or null, return an empty array.
Example

For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15],
you should return [10, -65].

Categories : Fundamentals, Arrays, Lists, Data Structures
Arithmetic, Mathematics, Algorithms, Numbers
 */
public class CountOfPosSumOfNegs {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        System.out.println(Arrays.toString(count(arr)));
    }
    static int[] count(int[] arr) {
        if (arr.length==0) return new int[0];
        int neg = 0;
        int poz = 0;
        for (int c : arr) {
            if(c<0) neg+=c;
            else if (c>0) poz++;
        }
        return new int[] {poz, neg};
    }
}