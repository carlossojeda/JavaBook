package Chapter3;

import java.util.Scanner;

public class FutureDays {
    public static void main(String[] args) {
        String dayName = "";
        int daysResult = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 0 (Sunday) and 6 (Saturday)");
        int day = sc.nextInt();

        System.out.println("Enter the number of days elapsed since today: ");
        int daysElapsed = sc.nextInt();

        System.out.println("Today is " + day + " and the future day is " + daysElapsed);


        if(daysElapsed > 6){
            daysResult = daysElapsed % 7 ;

            switch (daysResult){
                case 0: dayName = "Sunday";
                    break;
                case 1: dayName = "Monday";
                    break;
                case 2: dayName = "Tuesday";
                    break;
                case 3: dayName = "Wednesday";
                    break;
                case 4: dayName = "Thursday";
                    break;
                case 5: dayName = "Friday";
                    break;
                case 6: dayName = "Saturday";
                    break;

            }
                System.out.println(dayName);
        }


    }
}
