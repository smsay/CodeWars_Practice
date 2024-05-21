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
        String s ="String";
        String s1 ="Hello World";
        String s2 ="1234!_ ";
        System.out.println(doubleChar(s));
        System.out.println(doubleChar(s1));
        System.out.println(doubleChar(s2));
    }
    public static String doubleCharOpt(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            result.append(c).append(c);
        }

        return result.toString();
    }
    public static String doubleChar(String s) {
        String result="";
        for (int i = 0; i < s.length(); i++) {
            result+=s.charAt(i);
            result+=s.charAt(i);
        }
        return result;
    }


}