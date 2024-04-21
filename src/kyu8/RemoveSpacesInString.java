package kyu8;


/*
Remove String Spaces

Simple, remove the spaces from the string, then return the resultant string.

Categories : Fundamentals, Strings, Arrays

 */
public class RemoveSpacesInString {

    public static void main(String[] args) {

        System.out.println(YevgeniySolutionRemoveSpaces("Hello World"));
    }

    static String YevgeniySolutionRemoveSpaces(String s) {
        return s.replaceAll(" ", "");
    }
}