package Chapter3;

import java.util.Scanner;

public class SignNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an int");
        int number = sc.nextInt();

        System.out.println(number > 0 ? "Positive" : number < 0 ? "Negative" : "Zero");

    }
}
