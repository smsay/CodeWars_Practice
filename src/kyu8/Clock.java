package kyu8;


import java.time.LocalTime;

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

    public static int total(LocalTime time){

        return time.getHour()*3600000+time.getMinute()*60000+time.getSecond()*1000;
    }

    public static void main(String[] args) {
        System.out.println(total(LocalTime.now()));
    }






}