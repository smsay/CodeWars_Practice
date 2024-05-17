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

    public static void main(String[] args) {
        String s = "1 year old";
        System.out.println(age(s));
    }

    static int age(String s) {
        return Integer.parseInt(s.substring(0,1));
    }

}
