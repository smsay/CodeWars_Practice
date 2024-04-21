package kyu8;


/*
Remove First and Last Character

It's pretty straightforward.
Your goal is to create a function that removes the first and last characters of a string.
You're given one parameter, the original string.
You don't have to worry with strings with less than two characters.

Categories : Fundamentals, Basic Language Features, Strings

 */
public class RemoveChars {

    public static void main(String[] args) {

        String s = "Hello World";
        System.out.println(YevgeniySolutionRemoveChars(s));
    }

    static String YevgeniySolutionRemoveChars(String s) {
        return s.replace(s.substring(0, 1), "").replace(s.substring(s.length() - 1), "");
    }

}