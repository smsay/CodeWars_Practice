package kyu8;


/*
Fake Binary

Given a string of digits,
you should replace any digit below 5 with '0' and any digit 5 and above with '1'.
Return the resulting string.

Note: input will never be an empty string

Categories : Fundamentals, Strings, Arrays
 */
public class FakeBinary {

    public static void main(String[] args) {

        System.out.println(YevgeniySolution("45385593107843568"));
        System.out.println(YevgeniySolution("509321967506747"));
        System.out.println(YevgeniySolution("366058562030849490134388085"));
    }

    static String YevgeniySolution(String digits) {

        var result = new StringBuilder();

        for (var digit : digits.split("")) {
            if (Integer.parseInt(digit) < 5) result.append("0");
            else result.append("1");
        }
        return result.toString();
    }
}