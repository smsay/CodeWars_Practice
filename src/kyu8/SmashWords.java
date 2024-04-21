package kyu8;



/*
Sentence Smash

Write a function that takes an array of words and smashes them together into a sentence and returns the sentence.
You can ignore any need to sanitize words or add punctuation, but you should add spaces between each word. 
Be careful, there shouldn't be a space at the beginning or the end of the sentence!

Example:
['hello', 'world', 'this', 'is', 'great']  =>  'hello world this is great'

Categories : Strings, Arrays, Fundamentals
*/

public class SmashWords {

    public static void main(String[] args) {

        var array = new String[]{"hello", "world", "this", "is", "great"};
        System.out.println(YevgeniySolutionSmashWords(array));

    }

    static String YevgeniySolutionSmashWords(String[] array) {
        var result = new StringBuilder();

        for (var word : array) {
            result.append(word).append(" ");
        }

        return result.substring(0, result.length() - 1);
    }
}
