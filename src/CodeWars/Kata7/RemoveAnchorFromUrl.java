package CodeWars.Kata7;

import java.util.Arrays;

public class RemoveAnchorFromUrl {
    public static String removeUrlAnchor(String url){

        String[] without = (url.split("#"));
        System.out.println(without[0]);

        return without[0];
    }

    public static void main(String[] args) {
        System.out.println(removeUrlAnchor("www.codewars.com#about"));
    }
}
