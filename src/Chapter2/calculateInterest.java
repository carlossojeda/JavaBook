package Chapter2;

import java.util.Scanner;

public class calculateInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balance = sc.nextDouble();
        double annualInterestRate = sc.nextDouble();


        double interest = balance * (annualInterestRate / 1200);

        System.out.println(interest);
    }
}
