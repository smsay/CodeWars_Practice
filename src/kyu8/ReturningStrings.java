package kyu8;


/*
Returning Strings

Make a function that will return a greeting statement that uses an input;
your program should return, "Hello, <name> how are you doing today?".

[Make sure you type the exact thing I wrote or the program may not execute properly]

Categories : Fundamentals, Strings
 */
public class ReturningStrings {

    public static void main(String[] args) {

        var name = "Lucy";
        System.out.println(YevgeniySolutionGreeting(name));
    }

    static String YevgeniySolutionGreeting(String name) {
        return "Hello, " + name + " how are you today?";
    }
}