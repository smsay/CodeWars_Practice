package kyu8;


/*
Grasshopper - Check for factor

This function should test if the factor is a factor of base.
Return true if it is a factor or false if it is not.

About factors
Factors are numbers you can multiply together to get another number.

2 and 3 are factors of 6 because: 2 * 3 = 6
    You can find a factor by dividing numbers.
    If the remainder is 0 then the number is a factor.
    You can use the mod operator (%) in most languages to check for a remainder

For example 2 is not a factor of 7 because: 7 % 2 = 1
Note: base is a non-negative number, factor is a positive number.

Categories : Mathematics, Fundamentals

 */
public class GrassHopperCheckForFactor {

    public static void main(String[] args) {

        System.out.println(YevgeniySolutionCheckForFactor(10, 2));
        System.out.println(YevgeniySolutionCheckForFactor(63, 7));
        System.out.println(YevgeniySolutionCheckForFactor(2450, 5));

        System.out.println(YevgeniySolutionCheckForFactor(9,2));
        System.out.println(YevgeniySolutionCheckForFactor(653, 7));
        System.out.println(YevgeniySolutionCheckForFactor(2453, 5));

    }

    static boolean YevgeniySolutionCheckForFactor(int base, int factor) {
        if (base % factor == 0) return true;
        else return false;
    }
}
