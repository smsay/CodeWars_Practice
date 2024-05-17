package kyu8;



/*
Correct the mistakes of the character recognition software

Character recognition software is widely used to digitise printed texts. Thus the texts can be edited, searched and stored on a computer.

When documents (especially pretty old ones written with a typewriter), are digitised character recognition softwares often make mistakes.

Your task is correct the errors in the digitised text. You only have to handle the following mistakes:

    S is misinterpreted as 5
    O is misinterpreted as 0
    I is misinterpreted as 1

The test cases contain numbers only by mistake.

Categories : Fundamentals
 */
public class Correct {
    public static void main(String[] args) {
        System.out.println(correct2("150"));
    }

    static String correct(String document){ //O(n)
        document= document.replace("5", "S");
        document=  document.replace("0", "O");
        document=  document.replace("1", "I");
     return document;
    }

    static String correct1(String document){  // O(n^2)
        for (int i = 0; i < document.length(); i++) {
            if (document.charAt(i)=='5')
                document = document.replace(document.charAt(i), 'S');
            else if (document.charAt(i)=='1')
                document = document.replace(document.charAt(i), 'I');
            else if (document.charAt(i)=='0')
                document = document.replace(document.charAt(i), '0');
        }
        return document;
    }

    static String correct2(String d) {
        StringBuilder correctText = new StringBuilder();

        for (char c : d.toCharArray()) {
            switch (c) {
                case '5':
                    correctText.append('5');
                    break;
                case '1':
                    correctText.append('I');
                    break;
                case '0':
                    correctText.append('O');
                    break;
            }
        }
        return correctText.toString();
    }
}