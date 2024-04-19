package kyu8;



/*
Are You Playing Banjo?

Description:
Create a function which answers the question "Are you playing banjo?".
If your name starts with the letter "R" or lower case "r", you are playing banjo!

The function takes a name as its only argument, and returns one of the following strings:

name + " plays banjo"
name + " does not play banjo"

Names given are always valid strings.

Categories : Fundamentals, Strings, Functions, Control Flow, Basic Language Features
 */
public class Banjo {

    public static void main(String[] args) {

        String name = "Roman";
        String name2 = "Artur";

        YevgeniySolutionBanjo(name);
        YevgeniySolutionBanjo(name2);
    }
    static void YevgeniySolutionBanjo(String name) {

        if (name.startsWith("R") || name.startsWith("r"))
            System.out.println(name + " is playing banjo");
        else
            System.out.println(name + " does not play banjo");
    }
}