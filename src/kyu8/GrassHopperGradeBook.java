package kyu8;


/*
Grasshopper - Grade book

Description:
Grade book

Complete the function so that it finds the average of the three scores passed
to it and returns the letter value associated with that grade.

Numerical Score 	Letter Grade
90 <= score <= 100 	'A'
80 <= score < 90 	'B'
70 <= score < 80 	'C'
60 <= score < 70 	'D'
0 <= score < 60 	'F'

Tested values are all between 0 and 100.
There is no need to check for negative values or values greater than 100.
Fundamentals
 */
public class GrassHopperGradeBook {

    public static void main(String[] args) {

        System.out.println(YevgeniySolutionGradeBook(100));
    }

    static Character YevgeniySolutionGradeBook(int score) {
        if (score > 100 || score < 0) throw new IllegalArgumentException();
        if (score >= 90) return 'A';
        if (score >= 80) return 'B';
        if (score >= 70) return 'C';
        if (score >= 60) return 'D';
        return 'F';
    }

}