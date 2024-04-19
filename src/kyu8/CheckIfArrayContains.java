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

    public static void main(String[] args) {

        var name = new String[]{"Tatev", "Umit", "Gozde"};
        var nums = new Integer[]{1, 5, 10, 23, 41, 56};
        System.out.println(YevgeniySolutionCheckIfArrayContains(name, "Umit"));
        System.out.println(YevgeniySolutionCheckIfArrayContains(nums,11));

    }

    static <T, E> boolean YevgeniySolutionCheckIfArrayContains(T[] arr, E elem) {
        for (T t : arr) {
            if (t == elem)
                return true;
        }
        return false;
    }
}