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
        String s = "12345678910";
        System.out.println(fakeBinary("123456789"));
        System.out.println(fakeBinary("9876543210"));
    }

    public static String fakeBinary(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int each = Integer.parseInt(s.substring(i,i+1));
            if (each<5) {
                result.append(0);
            } else result.append(1);
        }
       return result.toString();
    }
}