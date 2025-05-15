package CodeWars.Kata8;

import java.util.Arrays;

public class CatYearsDogYears {
    public static int[] humanYearsCatYearsDogYears(final int humanYears)
    {
        int catYears = (humanYears * 4) + 16;
        int dogYears = (humanYears * 5) + 14;

        if(humanYears == 1){
            return new int[]{1, 15, 15};
        }
        else if(humanYears == 2){
            return new int[]{ 2, 24, 24};
        } else if(humanYears == 3){
            return new int[]{3, 28, 29};
        }
        return new int[]{humanYears, catYears, dogYears};



//        return new int[]{yearsHuman,catYears,dogYears};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(1)));
    }
}
