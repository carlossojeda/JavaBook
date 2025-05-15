package CodeWars.Kata8;

import java.util.Arrays;
import java.util.Objects;

public class AllStarCodeChallenge8 {
    public static int strCount (String str, char letter){

        String[] lengthStr = str.split("");
        int strLength = lengthStr.length;
        int count = 0;
        for (int i = 0; i < strLength; i++ ){
            System.out.println(lengthStr[i]);
            System.out.println(Arrays.toString(lengthStr));
            System.out.println(STR."lengthStr = \{lengthStr[i]}");
            if(lengthStr[i].equals(letter)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(strCount("ade", 'e'));
    }
}
