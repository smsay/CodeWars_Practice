package kyu8;


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
        var list = List.of(1,2,3,4,5,6,7);
    }

    static double avgNumber(List<Integer> list) {
        if (list.isEmpty()) return 0;
        return list.stream().collect(Collectors.averagingDouble(Double::valueOf));
    }
}