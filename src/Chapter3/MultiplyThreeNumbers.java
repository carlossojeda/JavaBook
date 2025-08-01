package Chapter3;

import java.util.Scanner;

public class MultiplyThreeNumbers {
    public static void main(String[] args) {

        int number1 = (int) (System.currentTimeMillis() % 10);
        int number2 = (int) (System.currentTimeMillis() / 10 % 10);
        int number3 = (int) (System.currentTimeMillis() / 100 % 10);
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        Scanner sc = new Scanner(System.in);

        System.out.println("What is " + number1 + " x " + number2 + " x " + number3 + "? ");
        int answer = sc.nextInt();

        System.out.println(number1 + " x " + number2 + " x " + number3 + " = " + answer + " is " + (number1 * number2 * number3 == answer));

    }
}
