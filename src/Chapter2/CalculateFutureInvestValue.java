package Chapter2;

import java.util.Scanner;

public class CalculateFutureInvestValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter investment amount: ");
        double investmentAmount = sc.nextDouble();

        System.out.println("Enter annual interest rate in percentage: ");
        double annualInterestRate = sc.nextDouble();

        double monthlyInterestRate = annualInterestRate / 1200;


        System.out.println("Enter number of years: ");
        double years = sc.nextDouble();

        double power = years * 12;

        double futureValue = investmentAmount * Math.pow(1 + monthlyInterestRate, power);
        System.out.println(futureValue);

    }
}
