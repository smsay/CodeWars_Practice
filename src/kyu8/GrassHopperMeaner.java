package kyu8;


/*
Find Mean

Find the mean (average) of a list of numbers in an array.
Information

To find the mean (average) of a set of numbers add all of the numbers together and divide by the number of values in the list.

For an example list of 1, 3, 5, 7

1. Add all of the numbers
1+3+5+7 = 16

2. Divide by the number of values in the list. In this example there are 4 numbers in the list.
16/4 = 4

3. The mean (or average) of this list is 4

Categories : Arrays, Lists, Fundamentals
*/
public class GrassHopperMeaner {

    public static void main(String[] args) {

        var array = new int[]{1, 3, 5, 7};
        System.out.println(YevgeniySolution(array));
    }

    static int YevgeniySolution(int[] array) {
        var sum = 0;

        for (var i : array) {
            sum += i;
        }
        return sum / array.length;
    }
}
