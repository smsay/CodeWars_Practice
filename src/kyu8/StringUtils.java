package kyu8;


/*
Description:
altERnaTIng cAsE <=> ALTerNAtiNG CaSe

Define toAlternatingCase such that each lowercase letter becomes uppercase
and each uppercase letter becomes lowercase.

For example:

toAlternativeString("hello world") == "HELLO WORLD"
toAlternativeString("HELLO WORLD") == "hello world"
toAlternativeString("hello WORLD") == "HELLO world"
toAlternativeString("HeLLo WoRLD") == "hEllO wOrld"
toAlternativeString("12345") == "12345" // Non-alphabetical characters are unaffected
toAlternativeString("1a2b3c4d5e") == "1A2B3C4D5E"
toAlternativeString("toAlternatingCase") == "TOaLTERNATINGcASE"

As usual, your function/method should be pure, i.e. it should not mutate the original string.
Categories : Fundamentals

 */
public class StringUtils {

    public static void main(String[] args) {

        System.out.println(YevgeniySolutionToAlternatingCase("hello world"));
        System.out.println(YevgeniySolutionToAlternatingCase("1a2b3c4d5e"));
        System.out.println(YevgeniySolutionToAlternatingCase("12345"));
        System.out.println(YevgeniySolutionToAlternatingCase("hEllO wOrld"));
    }

    static String YevgeniySolutionToAlternatingCase(String s) {
        var result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            var ch = s.charAt(i);
            if (Character.isLowerCase(ch) && !Character.isDigit(ch)) {
                result.append(("" + ch).toUpperCase());
            } else {
                result.append(("" + ch).toLowerCase());
            }
        }
        return result.toString();
    }
}