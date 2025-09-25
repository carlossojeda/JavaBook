package Chapter3;

import java.util.Scanner;

public class CurrentTime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your time zone ex (-6GMT) (Just the number)");
        int gmt = sc.nextInt();

        long currentMilis = System.currentTimeMillis();
        System.out.println("currentMilis = " + currentMilis);

        long totalSeconds = currentMilis / 1000;

        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;



        long currentHour = (totalHours % 24) + gmt;
        currentHour = (currentHour + 24) % 24;

        String timeDay = "am";

        switch ((int) currentHour) {
            case 0: {
                currentHour = 12;
                break;
            }
            case 12: {
                timeDay = "pm";
                break;
            }
            default:{
                if(currentHour > 12){
                    currentHour -= 12;
                    timeDay = "pm";
                }
            }
        }

        System.out.println(currentHour + " "+  currentMinute +" "+ currentSecond + " " + timeDay);


    }
}
