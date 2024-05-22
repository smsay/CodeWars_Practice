package kyu8;


/*
Remove exclamation marks

Write function RemoveExclamationMarks which
removes all exclamation marks from a given string.

Categories : Fundamentals
 */
class ExclamationRemover {

    public static void main(String[] args) {
        System.out.println(removeExclamation("!!!ytghhgh!dffdfg!!."));
    }

    public static String removeExclamation(String s) {
        StringBuilder result =new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) !='!') {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }

}