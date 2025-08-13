package RandomExercisesToImprove;

import java.util.Arrays;
import java.util.Scanner;

public class StartsWithConsorVowel {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.println("Enter a phrase");
        String phrase = sc.nextLine();
        phrase = phrase.toLowerCase();
        int phraseLength = phrase.length();
        int vowels = 0;
        int consonants = 0;

        boolean startWord = true;

        for(int i = 0; i < phraseLength; i++){
            char c = phrase.charAt(i);

            if(startWord && c >= 'a' && c <= 'z'){
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                    vowels++;
            } else {
                consonants++;
            } startWord = false;




            if(c == ' '){
                startWord = true;
            }
        }
            System.out.println("vowels = " + vowels);
            System.out.println("consonants = " + consonants);




    }
}
