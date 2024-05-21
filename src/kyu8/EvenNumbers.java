package kyu8;


import java.util.ArrayList;
import java.util.List;

/*
Find numbers which are divisible by given number

Complete the function which takes two arguments and returns all numbers which are divisible by the given divisor.
First argument is an array of numbers and the second is the divisor.
Example

divisibleBy([1, 2, 3, 4, 5, 6], 2) == [2, 4, 6]

Categories : Algorithms, Arrays
 */
public class EvenNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int divisor = 2;
        System.out.println(divisibleBy(arr, divisor));
    }
    public static List<Integer> divisibleBy(int[] arr, int divisor) {
        List<Integer> arrayList = new ArrayList<>();
        int[] result= new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%divisor==0) {
                arrayList.add(arr[i]);
            }
        }
        return arrayList;
    }

}