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

public  static String playingBanjo(String name){

    if(name.charAt(0)=='R'||name.charAt(0)=='r'){
        return (name+" plays banjo");
    }else{
        return (name+ " does not play banjo");
    }

}

    public static void main(String[] args) {

    String name="Gozde";
    String name2="Raki";
    String name3="remzi";
        System.out.println(playingBanjo(name));
        System.out.println(playingBanjo(name2));
        System.out.println(playingBanjo(name3));
    }

}