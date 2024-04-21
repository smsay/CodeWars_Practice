package kyu8;


/*
Calculate BMI

Description:
Write function bmi that calculates body mass index (bmi = weight / height2).

if bmi <= 18.5 return "Underweight"
if bmi <= 25.0 return "Normal"
if bmi <= 30.0 return "Overweight"
if bmi > 30 return "Obese"

Categories  : Fundamentals
 */
public class Calculate {

    public static String bmi(double weight,double height){

        double bmi = weight/height;

      return  ( bmi<=18.5)?"underweight":(bmi<=25.0)?"normal":(bmi<=30.0)?"overweight":"obese";

    }

    public static void main(String[] args) {

        System.out.println(bmi(100,3));
        System.out.println(bmi(100,4));
        System.out.println(bmi(100,5));
        System.out.println(bmi(100,6));
    }


}