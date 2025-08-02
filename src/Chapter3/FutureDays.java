package Chapter3;

import java.util.Scanner;

public class FutureDays {
    public static void main(String[] args) {
        String dayName = "", dayFuture = "";
        int daysResult = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 0 (Sunday) and 6 (Saturday)");
        int day = sc.nextInt();

        System.out.println("Enter the number of days elapsed since today: ");
        int daysElapsed = sc.nextInt();

        int futureDay = (day + daysElapsed) % 7;

        switch (day){
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

        switch (futureDay){
            case 0: dayFuture = "Sunday";
                break;
                case 1: dayFuture = "Monday";
                    break;
                case 2: dayFuture = "Tuesday";
                    break;
                case 3: dayFuture = "Wednesday";
                    break;
                case 4: dayFuture = "Thursday";
                    break;
                case 5: dayFuture = "Friday";
                    break;
                case 6: dayFuture = "Saturday";
                    break;

            }
                System.out.println(dayName);
                System.out.println("Today is " + dayName + " and the future day is " + dayFuture);



    }
}
