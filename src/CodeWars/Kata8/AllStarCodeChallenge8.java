package CodeWars.Kata8;

import java.util.Arrays;
import java.util.Objects;

public class AllStarCodeChallenge8 {
    public static int strCount (String str, char letter){

        String[] lengthStr = str.split("");
        int strLength = lengthStr.length;
        int count = 0;


        for (int i = 0; i < strLength; i++ ){
            if(str.isEmpty()){
                return 0;

            }
            if (str.charAt(i) == letter){
                count++;
            }



        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(strCount("adeeeee", 'e'));
        System.out.println(strCount("Hello", 'l'));
        System.out.println(strCount("H", 'l'));
        System.out.println(strCount("", 'z'));
    }
}
