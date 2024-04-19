package kyu8;


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

        String s1 = "Sam Harris";
        String s2 = "patrick feeney";
        System.out.println(YevgeniySolution(s1));
        System.out.println(YevgeniySolution(s2));
    }

    static String YevgeniySolution(String s) {

        var space = s.indexOf(" ");

        return s.substring(0, 1).toUpperCase() + "." + s.substring(space + 1, space + 2).toUpperCase();
    }
}