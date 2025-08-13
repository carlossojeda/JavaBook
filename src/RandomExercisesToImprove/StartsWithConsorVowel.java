package RandomExercisesToImprove;

import java.util.Scanner;

public class StartsWithConsorVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a phrase or word");
        String sentence = sc.next();
        System.out.println(sentence);
        int lenghtSentence = sentence.length();
        String sentceLower = sentence.toLowerCase();

        int vowelStart = 0;

        System.out.println(lenghtSentence);

        for (int i = 0; i < lenghtSentence; i++){
            if(sentceLower.startsWith("a") || sentceLower.startsWith("e") || sentceLower.startsWith("i") || sentceLower.startsWith("o")){

            }
        }

    }
}
