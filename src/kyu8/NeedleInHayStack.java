package kyu8;


/*
A Needle in the Haystack

Can you find the needle in the haystack?
Write a function findNeedle() that takes an array full of junk but containing one "needle"
After your function finds the needle it should return a message (as a string) that says:
"found the needle at position " plus the index it found the needle,

so:

findNeedle(new Object[] {"hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"})
should return "found the needle at position 5"

Categories : Fundamentals, Arrays
 */
public class NeedleInHayStack {

    public static void main(String[] args) {

        var arr = new String[]{"hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"};
        System.out.println(YevgeniySolutionFindNeedle(arr));
    }

    static String YevgeniySolutionFindNeedle(String[] array) {
        for (var i = 0; i < array.length; i++) {
            if (array[i].equals("needle")) {
                return "found the needle at position " + i;
            }
        }
        return "not found";
    }
}