package CodeWars.Kata7;

import java.util.Arrays;

public class SortArray {
    public static int[] sortArray(int[] array) {
        int [] basicArray = {15, 2, 7};
        int [] oddNumbers = new int[2];
        System.out.println(oddNumbers.length);
        System.out.println("basicArray = " + basicArray.length);;


        for (int i = 0; i < basicArray.length; i++){
            System.out.println("basicArray[i] = " + basicArray[i]);

            if(basicArray[i] % 2 != 0){
                oddNumbers = new int[]{i};
                System.out.println("odd");
            }
        }


        System.out.println("-----------------------");
        System.out.println(oddNumbers.length);

        System.out.println(Arrays.toString(oddNumbers));
        System.out.println(Arrays.toString(basicArray));
        int[] finalArray;



        return basicArray;
    }

    public static void main(String[] args) {

        int[] basicArray = new int[0];
        System.out.println(sortArray(basicArray));
    }
}
