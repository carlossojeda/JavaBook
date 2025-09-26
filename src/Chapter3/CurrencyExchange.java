package Chapter3;

import java.util.Scanner;

public class CurrencyExchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the exchange rate from usd to RPM: ");
        double exchangeRate = sc.nextDouble();


        System.out.println("Enter 0 to convert to USD to Chinese RBM \n Enter 1 to convert from Chinese RBM to USD: ");

        String usd = "dollar amount: ";
        String chineseRBM = "RBM amount ";

        int userInput = sc.nextInt();


        switch (userInput){
            case 0:{
                System.out.println("Enter the amount you want to exchange: ");
                double amount = sc.nextInt();
                double operation = amount * exchangeRate;
                System.out.println(amount + " is " + chineseRBM + operation +" yuan");
                break;
            }
            case 1:{
                System.out.println("Enter the amount you want to exchange: ");
                double amount = sc.nextInt();

                double operation = Math.round((amount / exchangeRate)) ;
                System.out.println(amount + " is " + chineseRBM + operation + " usd");
                break;
            }
            default:
                if(userInput > 2){
                    System.out.println("Incorrect Input");
                    break;
                }

        }

    }
}
