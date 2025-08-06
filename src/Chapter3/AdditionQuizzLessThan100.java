package Chapter3;

import java.util.Scanner;

public class AdditionQuizzLessThan100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String question = "What is the result? ";
        String rightAnswer = "You're right, keep going!";
        String wrongAnswer = "Don't give up, keep going!";

        int points = 1;
        int maximumScore = 10;



        for(int i = 0; points <= maximumScore; i++){

            int randomNumber1 = (int) (Math.random() * 100);
            int randomNumber2 = (int) (Math.random() * 100);

            System.out.println(question + randomNumber1 + " + " + randomNumber2);
            int result = randomNumber1 + randomNumber2;
            int userResult = sc.nextInt();

            if(userResult == result){
                System.out.println(rightAnswer);
                points++;
                System.out.println("So far u have: " + points + " points");
            } else {
                System.out.println(wrongAnswer);
                System.out.println("The right answer was: " + result);
                points--;
                System.out.println("So far u have: " + points + " points");

            }

            if(points == 0){
                System.out.println("You've lost!");
                break;
            } if(points == 10){
                System.out.println("You've won!");
                break;
            }
        }
    }
}
