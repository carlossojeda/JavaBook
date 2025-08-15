package CodeWars.Kata8;

import java.util.Arrays;

public class AddLength {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(addLength("hola como te va")));
    }

    public static String[] addLength(String str){

        int lengthSpaces = str.split(" ").length;
        System.out.println(str.split(" ").length);
        for(int i = 0; i < lengthSpaces; i++){
            System.out.print(str);
            int lengthWord = str.split(" ").length;
            System.out.println(lengthWord + "lenth");
        }

        return new String[0];
    }

}
