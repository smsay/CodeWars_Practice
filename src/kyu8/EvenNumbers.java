package kyu8;


import java.util.Arrays;

/*
Find numbers which are divisible by given number

Complete the function which takes two arguments and returns all numbers which are divisible by the given divisor. First argument is an array of numbers and the second is the divisor.
Example

divisibleBy([1, 2, 3, 4, 5, 6], 2) == [2, 4, 6]

Categories : Algorithms, Arrays
 */
public class EvenNumbers {

    public static void main(String[] args) {

        var nums = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(YevgeniySolutionEvenNumbers(nums, 2)));
    }

    private static int[] YevgeniySolutionEvenNumbers(int[] arr, int n) {

        var result = new int[arr.length];
        var k = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result[k++] = arr[i];
            }
        }
        return Arrays.copyOf(result, k);
    }
}