package kyu8;


/**
 * Convert boolean values to strings 'Yes' or 'No'.
 * Complete the method that takes a boolean value
 * and return a "Yes" string for true, or a "No" string for false.
 *
 * Categories: Fundamentals, Booleans, Best Practices
 * https://www.codewars.com/kata/53369039d7ab3ac506000467
 */
public class ConvertBooleanToYesNoStrings {

    public static String yesNo(boolean result){

        return (result==true)?"yes":"no";
    }

    public static void main(String[] args) {
        System.out.println(yesNo(false));
        System.out.println(yesNo(true));
    }


}
