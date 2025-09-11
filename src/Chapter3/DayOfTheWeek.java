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

        double k = (int) (year % 100);
        double j = (int) year/100;
        double dayOfTheWeek =(int) (day + (26 *(month + 1) / 10) + k + k/4 + j/4 + (5 * j)) % 7;

        System.out.println(dayOfTheWeek);


    }




}
