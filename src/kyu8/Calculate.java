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

        YevgeniySolutionCalculateBMI(80,1.8);
    }

    public static void YevgeniySolutionCalculateBMI(double weight, double height) {

        var bmi = weight / (height * height);

        if (bmi < 18.5) System.out.println("Underweight");
        else if (bmi < 25.0) System.out.println("Normal");
        else if (bmi < 30.0) System.out.println("Overweight");
        else System.out.println("Obese");
    }
}