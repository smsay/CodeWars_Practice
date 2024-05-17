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

    public static void main(String[] args) {
        double weight=73, height=1.86;
        bmi(weight,height);
    }

    public static String bmi(double weight, double height) {

        var bmi=weight/(height*height);
        System.out.println(bmi);
        if (bmi <= 18.5) return "Underweight";
        else if (bmi <= 25.0) return "Normal";
        else if (bmi <= 30.0) return "Overweight";
        else return "Obese";
    }

}