package kyu8;


/*
Double Char

Given a string, you have to return a string in which each character (case-sensitive) is repeated once.

doubleChar("String") ==> "SSttrriinngg"
doubleChar("Hello World") ==> "HHeelllloo  WWoorrlldd"
doubleChar("1234!_ ") ==> "11223344!!__  "

Good Luck!

Categories :  Fundamentals, Loops, Control Flow, Basic Language Features

 */
public class DoubleChars {

    public static void main(String[] args) {

        System.out.println(YevgeniySolutionDoubleChars("String"));
        System.out.println(YevgeniySolutionDoubleChars("Hello World"));
    }

    static String YevgeniySolutionDoubleChars(String s) {

        var result = new StringBuilder();

        for (var ch : s.toCharArray()) {
            result.append(ch).append(ch);
        }
        return result.toString();
    }
}