package CodeWars.Kata8;

import java.util.Arrays;

public class ReversedSequence {
    public static int[] reverse(int n){

        int[] newArr = new int[n];
        for(int i = 0; i < n; i++){
            newArr[i] = n - i;
        }

        return newArr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(5)));
    }
}
