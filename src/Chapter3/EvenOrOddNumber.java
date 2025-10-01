package Chapter3;

import java.util.Scanner;

public class EvenOrOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an Integer");
        int userNumber = sc.nextInt();


        String messageResult = (userNumber % 2 == 0) ?  userNumber + " is an even number" : userNumber + " is and odd number";

        System.out.println(messageResult);
    }
}
