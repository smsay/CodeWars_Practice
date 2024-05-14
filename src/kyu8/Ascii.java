package kyu8;

/*
get character from ASCII Value

Write a function getChar() which takes a number
and returns the corresponding ASCII char for that value.

Example:
get_char(65)  should return:  'A'

For ASCII table, you can refer to http://www.asciitable.com/
Categories : Fundamentals
 */
public class Ascii {
    public static void main(String[] args) {
        int number = 80;
        System.out.println(getChar(number));
    }

    public static char getChar(int number) {
        char c =(char)number;
        return c;
    }
}