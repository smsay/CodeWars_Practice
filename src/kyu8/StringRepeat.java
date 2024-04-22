package kyu8;


/*
String repeat

Description:

Write a function called repeatStr which repeats the given string string exactly n times.

repeatStr(6, "I") // "IIIIII"
repeatStr(5, "Hello") // "HelloHelloHelloHelloHello"

Categories : Fundamentals
 */
public class StringRepeat {

    public static void main(String[] args) {

        System.out.println(YevgeniySolutionRepeat(6, "I"));
        System.out.println(YevgeniySolutionRepeat(5, "Hello"));
    }

    static String YevgeniySolutionRepeat(int i, String s) {
        return s.repeat(i);
    }
}
