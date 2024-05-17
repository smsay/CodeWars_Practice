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
        System.out.println(isBanjo("Ayse"));
        System.out.println(isBanjo("Pelin"));
    }
    static String isBanjo(String name) {
        if (name.toLowerCase().startsWith("p"))
                  return name + " plays banjo";

        return name + " does not play banjo";
    }

}