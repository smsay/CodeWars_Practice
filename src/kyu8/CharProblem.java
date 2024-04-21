package kyu8;


/*
Parse nice int from char problem

Ask a small girl - "How old are you?". She always says strange things... Lets help her!

For correct answer program should return int from 0 to 9.

Assume test input string always valid and
may look like "1 year old" or "5 years old", etc.. The first char is number only.

Categories : Fundamentals, Integers, Numbers, Chars
 */
public class CharProblem {

    public static char age(String str) {
        return str.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(age("1 year old"));
    }
}
