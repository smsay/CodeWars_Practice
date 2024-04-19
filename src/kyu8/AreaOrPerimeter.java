package kyu8;


/*
Area or Perimeter

You are given the length and width of a 4-sided polygon.
The polygon can either be a rectangle or a square.
If it is a square, return its area. If it is a rectangle, return its perimeter.

area_or_perimeter(6, 10) --> 32
area_or_perimeter(3, 3) --> 9

Note: for the purposes of this kata you will assume that it is a square if its length and width are equal,
otherwise it is a rectangle.

Categories : Fundamentals

 */
public class AreaOrPerimeter {

    public static void main(String[] args) {

        System.out.println(YevgeniySolutionAreaOrPerimeter(6, 10));
        System.out.println(YevgeniySolutionAreaOrPerimeter(3, 3));

    }

    static int YevgeniySolutionAreaOrPerimeter(int a, int b) {

        if (a == b)
            return a * b;
        else
            return (a + b) * 2;
    }
}