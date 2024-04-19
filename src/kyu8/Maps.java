package kyu8;


import java.util.Arrays;

/*
Beginner - Lost Without a Map

Given an array of integers, return a new array with each value doubled.

For example:

[1, 2, 3] --> [2, 4, 6]

Categories : Fundamentals, Arrays, Numbers
 */
public class Maps {

    public static void main(String[] args) {

        var arr = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(YevgeniySolutionDoubled(arr)));
    }

    static int[] YevgeniySolutionDoubled(int[] arr) {
        var nums = new int[arr.length];
        var k = 0;
        for (var i : arr) {
            nums[k++] = i * 2;
        }
        return nums;
    }
}