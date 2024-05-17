package kyu8;



/*
Beginner Series #2 Clock

Description:

Clock shows h hours, m minutes and s seconds after midnight.
Your task is to write a function which returns the time since midnight in milliseconds.

Example:

h = 0
m = 1
s = 1

result = 61000

Input constraints:
    0 <= h <= 23
    0 <= m <= 59
    0 <= s <= 59

Categories : Fundamentals
 */
public class Clock {
    public static void main(String[] args) {
        int h = 0;
        int m =1;
        int s= 1;
        System.out.println(clock(0, 1, 1));
    }
    static long clock(int h, int m, int s) {
        return 1000L*(h*3600+m*60+s);
    }

}