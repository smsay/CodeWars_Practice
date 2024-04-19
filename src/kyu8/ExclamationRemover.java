package kyu8;


/*
Remove exclamation marks

Write function RemoveExclamationMarks which
removes all exclamation marks from a given string.

Categories : Fundamentals
 */
class ExclamationRemover {

    public static void main(String[] args) {

        String s = "Hello World!";
        System.out.println(YevgeniySolutionRemover(s));
    }

    static String YevgeniySolutionRemover(String s) {
        return s.replace("!", "");

    }
}