package kyu8;


/*
Sum Mixed Array

Given an array of integers as strings and numbers,
return the sum of the array values as if all were numbers.

Return your answer as a number.

Categories : Fundamentals, Strings, Numbers, Arrays
 */
public class MixedSum {

    public static void main(String[] args) {

        var array = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        System.out.println(YevgeniySolutionMixedSum(array));
    }

    static int YevgeniySolutionMixedSum(String[] arr) {

        var sum = 0;

        for (var e : arr) {
            sum += Integer.parseInt(e);
        }
        return sum;
    }

}