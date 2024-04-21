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

    public static char letter(int n){

       return (char)n;
    }

    public static void main(String[] args) {
        System.out.println(letter(65));
    }

}