package Chapter3;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Generate a lottery number
        int lottery = (int) (Math.random() * 100);



        //Prompt the user to enter a guess
        System.out.println("Enter your lottery pick (two digits): ");
        int guess = sc.nextInt();

        //Get digits from lottery
        int lotteryDigit1 = lottery  / 10;
        int lotteryDigit2 = lottery % 10;

        //Get digits from guess
        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        System.out.println("The lottery number is: " + lottery);

        //Check the guess
        if(guess == lottery){
            System.out.println("Exact match: you win $10,000");
        } else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2) {
            System.out.println("Match all digits: you win $3,000");
        } else if (guessDigit1 == lotteryDigit1
                    || guessDigit1 == lotteryDigit2
                    || guessDigit2 == lotteryDigit1
                    || guessDigit2 == lotteryDigit2) {
            System.out.println("Match one: you win $1,000");
        } else System.out.println("Sorry, no Match");


    }
}
