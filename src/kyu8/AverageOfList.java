package kyu8;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Calculate average

Write a function which calculates the average of the numbers in a given list.

Note: Empty arrays should return 0.

Categories : Fundamentals, Functional Programming, Declarative Programming

 */
public class AverageOfList {

    public static void main(String[] args) {

        var list = Arrays.asList(1, 2, 3, 4, 5, 52, 6, 34, 7, 8, 9, 11, 24, 31);
        System.out.println(YevgeniySolutionAverageOfList(list));
    }

    static double YevgeniySolutionAverageOfList(List<Integer> list) {
        if (list.isEmpty())
            return 0;
        else
            return list.stream().
                    collect(Collectors.averagingDouble(Double::valueOf));
    }
}