package kyu8;

/*
You only need one - Beginner

Description:

You will be given an array a and a value x. All you need to do is check whether the provided array contains the value.

Array can contain numbers or strings. X can be either.

Return true if the array contains the value, false if not.

Categories : Fundamentals, Booleans, Strings, Numbers, Arrays

 */
public class CheckIfArrayContains {

    public static <T> boolean contains(T[] arr, T n){

        for (T each : arr) {
            if(each==n||each.equals(n))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Integer[] arr={1,3,6,65,78};
        String[] arr2 ={"Gozde","Onur","Ada"};

        System.out.println(contains(arr,65));
        System.out.println(contains(arr2,"Ada"));
        System.out.println(contains(arr,2));
        System.out.println(contains(arr2,"Ozge"));
    }





}