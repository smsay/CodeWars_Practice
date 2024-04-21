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

public static String initials(String str){

  return (str.charAt (0)+"."+str.charAt (str.indexOf(" ")+1)).toUpperCase();
}

    public static void main(String[] args) {
        String str = "Sam Harris";
        String str1= "patrick feeney";

        System.out.println(initials(str));
        System.out.println(initials(str1));

    }


}