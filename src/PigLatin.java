
/* https://www.codewars.com/kata/520b9d2ad5c005041100000f/train/java

 Move the first letter of each word to the end of it, then add "ay" to the end of the word.
 Leave punctuation marks untouched.

 pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
 pigIt('Hello world !');     // elloHay orldway !
*/

public class PigLatin {
    public static String pigIt(String str) {

        String[] strParts = str.split(" ");
        String firstPart = "";
        String secondPart = "";
        String newString = "";
        char isPunсtMark;

        for (String elem : strParts) {
            isPunсtMark = elem.charAt(0);

            if (!(isPunсtMark == '?' || isPunсtMark == '!')) {
                firstPart = elem.substring(0, 1);
                secondPart = elem.substring(1);
                newString += secondPart + firstPart + "ay ";
            }
        }
        return newString.trim();
    }
}