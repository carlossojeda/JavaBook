package Chapter3;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {

        /*Zeller’s congruence is an algorithm developed by
        Christian Zeller to calculate the day of the week.
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = sc.nextInt();

        System.out.println("Enter a month: (1-12) ");
        int month = sc.nextInt();

        System.out.println("Enter a day of the month: (1-31): ");
        int day = sc.nextInt();


        if (month == 1) {
            month = 13;
            year--; // retrocede un año
        } else if (month == 2) {
            month = 14;
            year--; // retrocede un año
        }


        int q = day;
        int m = month;
        int k = year % 100;
        int j = year / 100;


        int operation1 = (26 * (month + 1) / 10);
        int operation2 = year % 100;
        int opeation3 = operation2 / 4;
        int operation4 = year / 100;
        int operation5 = 5 * operation4;

        int operation = (day + operation1 + operation2 + opeation3 + (operation4 / 4) + operation5) % 7;


//
//        int q = day;
//        int m = month;
//        int K = year % 100;
//        int J = year / 100;
//
//        int h = (q + (26 * (m + 1)) / 10 + K + (K / 4) + (J / 4) + (5 * J)) % 7;


        String dayOfWeek = switch (operation) {
            case 0 -> "Saturday";
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            default -> "Error";
        };

        System.out.println("Day of the week is " + dayOfWeek);


    }




}
