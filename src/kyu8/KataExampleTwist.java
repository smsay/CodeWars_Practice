package kyu8;


import java.util.Arrays;

/*
Kata Example Twist

This is an easy twist to the example kata
(provided by Codewars when learning how to create your own kata).

Add the value "codewars" to the array websites/Websites 1,000 times.

String[] websites = {};
return websites;

Categories : Fundamentals
 */
public class KataExampleTwist {

    public static void main(String[] args) {

        var websites = new String[1000];

        System.out.println(Arrays.toString(YevgeniySolutionAddValue(websites)));
    }

    static String[] YevgeniySolutionAddValue(String[] array) {
        for (int i = 0; i < 1000; i++) {
            array[i] = "codewars";
        }
        return array;
    }
}