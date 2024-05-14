package kyu8;


import java.util.Arrays;

/*
Abbreviate a Two Word Name

Write a function to convert a name into initials.
This kata strictly takes two words with one space in between them.

The output should be two capital letters with a dot separating them.

It should look like this:

Sam Harris => S.H
patrick feeney => P.F

Categories : Fundamentals, Strings, Arrays
 */
public class AbbreviateTwoWords {
    public static void main(String[] args) {
        String name ="Sam Harris";
        System.out.println(initial(name));
    }

    public static String initial(String name) {
        String[] array = name.split(" ");
        System.out.println(Arrays.toString(array));
        String initial="";
        for (int i = 0; i < array.length; i++) {
            initial+= array[i].charAt(0)+".";
        }
        return initial;
    }

}