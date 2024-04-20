package kyu8;


import java.util.ArrayList;
import java.util.List;

/*
Lario and Muigi Pipe Problem

Issue
Looks like some hoodlum plumber and his brother has been running around and damaging your stages again.

The pipes connecting your level's stages together need to be fixed before you receive any more complaints.
Each pipe should be connecting, since the levels ascend,
you can assume every number in the sequence after the first index
will be greater than the previous and that there will be no duplicates.

Task
Given a list of numbers, return the list so that the values increment by 1 for each index up to the maximum value.

Example
Input: 1,3,5,6,7,8
Output: 1,2,3,4,5,6,7,8

 */
public class LarioAndMuigiPipeProblem {

    public static void main(String[] args) {

        var arr = new int[]{1, 3, 5, 6, 7, 8};
        System.out.println(YevgeniySolutionPipeProblem(arr));
    }

    static List<Integer> YevgeniySolutionPipeProblem(int[] array) {
        var list = new ArrayList<Integer>();
        for (int i = 1; i < array.length; i++) {
            if (array[i] - array[i - 1] != 1) {
                list.add(array[i - 1]);
                list.add(array[i - 1] + 1);
            } else {
                list.add(array[i - 1]);
            }
        }
        list.add(array[array.length - 1]);
        return list;
    }
}