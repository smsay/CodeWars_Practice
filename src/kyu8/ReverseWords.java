package kyu8;


/*
Reversed Words

Complete the solution so that it reverses all of the words within the string passed in.

Example:
"The greatest victory is that which requires no battle"
-->
"battle no requires which that is victory greatest The"

Categories : Algorithms, Strings
 */
public class ReverseWords {

    public static void main(String[] args) {

        System.out.println(YevgeniySolutionReverseWords("The greatest victory is that which requires no battle"));
    }

    static String YevgeniySolutionReverseWords(String s) {

        var result = new StringBuilder();
        var string = s.split(" ");

        for (int i = string.length - 1; i >= 0; i--) {
            result.append(string[i]).append(" ");
        }
        return result.toString();
    }
}