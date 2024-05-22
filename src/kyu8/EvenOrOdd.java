package kyu8;



/*
Even or Odd

Create a function that takes an integer as an argument
and returns "Even" for even numbers or "Odd" for odd numbers.

Categories : Fundamentals, Mathematics, Algorithms, Numbers
 */
public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println(oddOrEven(21));
    }

    public static String oddOrEven(int a) {
        if (a%2==0) return "Even";
        return "Odd";
    }
}