package kyu8;


import java.util.Arrays;

/*
Cat years, Dog years

Kata Task
I have a cat and a dog.
I got them at the same time as kitten/puppy. That was humanYears years ago.
Return their respective ages now as [humanYears,catYears,dogYears]

NOTES:
    humanYears >= 1
    humanYears are whole numbers only
Cat Years
    15 cat years for first year
    +9 cat years for second year
    +4 cat years for each year after that
Dog Years
    15 dog years for first year
    +9 dog years for second year
    +5 dog years for each year after that

References
    http://www.catster.com/cats-101/calculate-cat-age-in-cat-years
    http://www.slate.com/articles/news_and_politics/explainer/2009/05/a_dogs_life.html

Categories : Fundamentals
 */
public class Dinglemouse {
    public static void main(String[] args) {

        int a=5;
        System.out.println(Arrays.toString(convertYear(a))); //[humanYears,catYears,dogYears]
        System.out.println(Arrays.toString(calculateAges(5)));
    }

    public static int[] convertYear(int a) {
        int c, d = 0;

     if (a>=1&&a<2) {
         c=15;
         d=15;
     } else if (a>=2&&a<3) {
         c=15+9;
         d=15+9;
     } else  {
         c=15+9+(4*(a-2));
         d=15+9+(5*(a-2));
     }
     return new int[]{a,c,d};
    }

    public static int[] calculateAges(int humanYears) {
        int catYears = 0;
        int dogYears = 0;

        if (humanYears >= 1) {
            if (humanYears >= 1) {
                catYears += 15;
                dogYears += 15;
            }
            if (humanYears >= 2) {
                catYears += 9;
                dogYears += 9;
            }
            if (humanYears > 2) {
                catYears += (humanYears - 2) * 4;
                dogYears += (humanYears - 2) * 5;
            }
        }

        return new int[] {humanYears, catYears, dogYears};
    }

}