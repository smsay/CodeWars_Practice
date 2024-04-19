package kyu8;


/**
 * Convert boolean values to strings 'Yes' or 'No'.
 * Complete the method that takes a boolean value
 * and return a "Yes" string for true, or a "No" string for false.
 * <p>
 * Categories: Fundamentals, Booleans, Best Practices
 * https://www.codewars.com/kata/53369039d7ab3ac506000467
 */
public class ConvertBooleanToYesNoStrings {

    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;

        System.out.println(YevgeniySolutionConvertBooleanToString(a));
        System.out.println(YevgeniySolutionConvertBooleanToString(b));

    }

    static String YevgeniySolutionConvertBooleanToString(boolean answer) {
        return answer ? "Yes" : "No";
    }

}
