package isogram;


import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        System.out.println(isograms("moOse"));



    }
    public static boolean isograms(String word){
/* An isogram is a word that has no repeating letters, consecutive or non-consecutive.
 Implement a function that determines whether a string that contains only letters is an isogram.
 Assume the empty string is an isogram. Ignore letter case.
 */
        for (int i = 0; i<word.toLowerCase().length(); i++)
            for (int j = i + 1; j < word.toLowerCase().length(); j++)
                if (word.toLowerCase().charAt(i) == word.toLowerCase().charAt(j)) {

                    return false;
                }


        return true;
    }
}
