package kyu8;


/*
Triple Trouble

Create a function that will return a string that combines all the
letters of the three inputted strings in groups.
Taking the first letter of all the inputs and grouping them next to each other.
Do this for every letter, see example below!

E.g. Input: "aa", "bb" , "cc" => Output: "abcabc"

Note: You can expect all the inputs to be the same length.

Categories : Puzzles
 */
public class TripleTrouble {

    public static void main(String[] args) {

        System.out.println(YevgeniySolutionTripleTrouble("aa", "bb", "cc"));
    }

    static String YevgeniySolutionTripleTrouble(String first, String second, String third) {

        var length = first.length();
        var result = new StringBuilder();

        for (int i = 0; i < length; i++) {
            result.append(first.charAt(i)).append(second.charAt(i)).append(third.charAt(i));
        }
        return result.toString();
    }
}