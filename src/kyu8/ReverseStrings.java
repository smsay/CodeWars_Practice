package kyu8;


/*
Reversed Strings

Complete the solution so that it reverses the string passed into it.

'world'  =>  'dlrow'
'word'   =>  'drow'

Categories : Fundamentals, Strings
 */
public class ReverseStrings {

    public static void main(String[] args) {

        System.out.println(YevgeniySolutionReverseString("Hello"));
        System.out.println(YevgeniySolutionReverseString2("Hello"));
    }

    static String YevgeniySolutionReverseString(String s) {

        var result = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            result.append(s.charAt(i));

        }
        return result.toString();
    }

    static String YevgeniySolutionReverseString2(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}