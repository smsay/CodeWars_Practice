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
        var name = new String[] {"Ayse", "Sevgi", "Leman"};
        var nums = new Integer[] {1,3,5,6,8};

        System.out.println(check(name, "Sevgi"));
        System.out.println(check(nums, 1));
    }

static <T, E> boolean check(T[] arr,E e ) {
    for (T t : arr) {
        if(t==e) return true;
    }
    return false;
}
}