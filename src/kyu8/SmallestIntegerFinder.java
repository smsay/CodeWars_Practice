package kyu8;


/*
Find the smallest integer in the array

Description:

Given an array of integers your solution should find the smallest integer.

For example:

    Given [34, 15, 88, 2] your solution will return 2
    Given [34, -345, -1, 100] your solution will return -345

You can assume, for the purpose of this kata,
that the supplied array will not be empty.

Categories : Fundamentals
 */
public class SmallestIntegerFinder {

    public static void main(String[] args) {

        var array = new int[]{34, 15, 88, 2};
        var array2 = new int[]{34, -345, -1, 100};
        System.out.println(YevgeniySolutionFindSmallest(array));
        System.out.println(YevgeniySolutionFindSmallest(array2));


    }

    static int YevgeniySolutionFindSmallest(int[] arr) {

        var smallest = arr[0];

        for (var e : arr) {
            if (e < smallest) {
                smallest = e;
            }
        }
        return smallest;
    }
}