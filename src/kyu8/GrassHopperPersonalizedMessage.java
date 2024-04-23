package kyu8;


/*
Description:

Create a function that gives a personalized greeting. This function takes two parameters: name and owner.

Use conditionals to return the proper message:

case --> return
name equals owner --> 'Hello boss'
otherwise --> 'Hello guest'

Categories : Fundamentals, Conditional Statements
Control Flow, Basic Language Features
 */
class GrassHopperPersonalizedMessage {

    public static void main(String[] args) {

        System.out.println(YevgeniySolution("John","John"));
        System.out.println(YevgeniySolution("John","Sam"));

    }

    static String YevgeniySolution(String name, String owner) {
        if (name.equals(owner)) return "Hello boss";
        return "Hello guest";
    }
}