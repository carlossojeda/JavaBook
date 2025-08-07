package Chapter3;

import java.util.Scanner;

public class FindTheNumberOfDaysInAMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a month in number, example: 1 = January and a year");

        int month = sc.nextInt();
        int year = sc.nextInt();

        boolean isleapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);


        String month1 = "January";
        String month2 = "February";
        String month3 = "March";
        String month4 = "April";
        String month5 = "May";
        String month6 = "June";
        String month7 = "July";
        String month8 = "August";
        String month9 = "September";
        String month10 = "October";
        String month11 = "November";
        String month12 = "December";


        if(month == 1){
            System.out.println(month1 + " " + year + " has 31 days");
        }
        if (month == 2) {
            if(isleapYear){
                System.out.println(month2 + " " + year + " has 29 days");
            } else System.out.println(month2 + " " + year + " has 28 days");
        }
        if (month == 3) {
            System.out.println(month3 + " " + year + " has 31 days");
        }
        if (month == 4){
            System.out.println(month4 + " " + year + " has 30 days");
        }
        if (month == 5){
            System.out.println(month5 + " " + year + " has 31 days");
        }
        if (month == 6){
            System.out.println(month6 + " " + year + " has 30 days");
        }
        if (month == 7){
            System.out.println(month7 + " " + year + " has 31 days");
        }
        if (month == 8){
            System.out.println(month8 + " " + year + " has 31 days");
        }
        if (month == 9){
            System.out.println(month9 + " " + year + " has 30 days");
        }
        if (month == 10){
            System.out.println(month10 + " " + year + " has 31 days");
        }
        if (month == 11){
            System.out.println(month11 + " " + year + " has 30 days");
        }
        if (month == 12){
            System.out.println(month12 + " " + year + " has 31 days");
        }
    }
}
