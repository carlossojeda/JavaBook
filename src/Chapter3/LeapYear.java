package Chapter3;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year");
        int year = sc.nextInt();
        int leapCount = 0;

        boolean isLeapYear = (year % 4 == 0);

        isLeapYear = isLeapYear && (year % 100 != 0);

        isLeapYear = isLeapYear || (year % 400 == 0);


         isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        System.out.println(year + " is a leap year? " + isLeapYear);


        for(int i = 0; i <= 50; i++){
            isLeapYear = (i % 4 == 0 && i % 100 != 0) || (i % 400 == 0);
            if(isLeapYear){
                leapCount++;
            }

            System.out.println(i + " is a leap year? " + isLeapYear);
        }
        System.out.println("Total leap years between 0 and 3000: " + leapCount);
    }
}
