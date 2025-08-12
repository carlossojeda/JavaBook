package RandomExercisesToImprove;

import java.util.Arrays;
import java.util.Locale;

public class CountingVowels {
    public static void main(String[] args) {
        /*This project counts every vowel and consonants that are includes in a text*/
        String text = "Tres tristes tigres tragaban trigo en un trigal";
        int lengthText = text.length();
        int vowels = 0;
        int consonants = 0;

        text = text.toLowerCase();

        for(int i = 0; i < lengthText; i++){
            char c = text.charAt(i);

            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                vowels++;
            } else consonants++;
        }

        System.out.println("The text, has " + vowels + " vowels");
        System.out.println("The text has " + consonants + " consonants");
    }
}
