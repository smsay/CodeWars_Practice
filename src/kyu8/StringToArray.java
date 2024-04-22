package kyu8;


import java.util.Arrays;

/*
Convert a string to an array

Write a function to split a string and convert it into an array of words. For example:

"Robin Singh" ==> ["Robin", "Singh"]
"I love arrays they are my favorite" ==> ["I", "love", "arrays", "they", "are", "my", "favorite"]

Categories : Fundamentals, Arrays, Strings
 */
public class StringToArray {

    public static void main(String[] args) {
        var sentence = "I love arrays they are my favourite";
        System.out.println(Arrays.toString(YevgeniySolutionStringToArray(sentence)));
    }

    static String[] YevgeniySolutionStringToArray(String s) {
            return s.split(" ");
    }
}