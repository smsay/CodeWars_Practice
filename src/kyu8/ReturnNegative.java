package kyu8;


/*
Return Negative

Description:

In this simple assignment you are given a number and have to make it negative.
But maybe the number is already negative?

Examples
makeNegative(1); // return -1
makeNegative(-5); // return -5
makeNegative(0); // return 0

Notes
    The number can be negative already, in which case no change is required.
    Zero (0) is not checked for any specific sign.
    Negative zeros make no mathematical sense.

Categories : Fundamentals, Numbers

 */
public class ReturnNegative {

    public static void main(String[] args) {

        System.out.println(YevgeniySolutionReturnNegative(-1));
    }

    static int YevgeniySolutionReturnNegative(int n) {
        if (n < 0) return n;
        if (n > 1) return -n;
        return 0;
    }
}