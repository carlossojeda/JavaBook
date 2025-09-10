package Chapter3;

import javax.swing.*;
import java.util.Scanner;

public class LotteryWith3Digits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        int lotteryNumber = (int) (100 + Math.random() * 100);
        int lotteryNumber = 157;
        int lotteryNumber1 = lotteryNumber / 100;
        int lotteryNumber2 = (lotteryNumber % 100) / 10;
        int lotteryNumber3 = lotteryNumber % 10;

        System.out.println(lotteryNumber);

        System.out.println("Enter a three digit number");
        int userNumber = sc.nextInt();
        int userNumber1 = userNumber / 100;
        int userNumber2 = (userNumber % 100) / 10;
        int userNumber3 = userNumber % 10;
        System.out.println(userNumber);

        if(userNumber == lotteryNumber){
            System.out.println("Congratulations you have won 10,000 usd!");
        }
        else if (userNumber1  == lotteryNumber2 && userNumber2 == lotteryNumber3 && userNumber3 == lotteryNumber1 || userNumber1 == lotteryNumber3 && userNumber2 == lotteryNumber1 && userNumber3 == lotteryNumber2 || userNumber1 == lotteryNumber1 && userNumber2 == lotteryNumber3 && userNumber3 == lotteryNumber2 || userNumber2 == lotteryNumber2 && userNumber1 == lotteryNumber3 && userNumber3 == lotteryNumber1|| userNumber3 == lotteryNumber3 && userNumber1 == lotteryNumber2 && userNumber2 == lotteryNumber1) {

            System.out.println("Congratulations, you have won 3,000 usd");
        }
        else if (userNumber1 == lotteryNumber1 || userNumber1 == lotteryNumber2 || userNumber1 == lotteryNumber3 || userNumber2 == lotteryNumber1 || userNumber2 == lotteryNumber2 || userNumber2 == lotteryNumber3 || userNumber3 == lotteryNumber1 || userNumber3 == lotteryNumber2 || userNumber3 == lotteryNumber3){
            System.out.println("Congratulations, You have won 1,000 usd");
        } else {
            System.out.println("Luck next time!, you have 0 right number, the machine number was: " + lotteryNumber);
        }
    }
}
