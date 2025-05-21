package CodeWars.Kata8;

import java.util.Arrays;

public class IsTheStringUpperCase {
    public static boolean isUpperCase(String s){

        boolean result = true;

        for(int i = 0; i < s.length(); i++){
        char letter = s.charAt(i);
           System.out.println(s.charAt(i));
           if(Character.isLowerCase(letter)){
               return false;
           }
       }
       return result;
    }

    public static void main(String[] args) {
        System.out.println(isUpperCase("HELLO IAMDONALD1"));
    }
}
