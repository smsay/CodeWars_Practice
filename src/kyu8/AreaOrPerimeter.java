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
       // int length=3, width=3;
        int length=6, width=10;

        System.out.println(area_or_perimeter(length,width));
    }

    public static int area_or_perimeter(int length, int width) {
        if (length==width) return length*width;
        return 2*(length+width);
    }


}