package Chapter3;

import java.util.Scanner;

public class SubstractionQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String question = "What is the result?: ";
        String succeed = "Congratulations, you're right";
        String failedMSg = "Keep going!";
        int points = 1;
        int maximumScore = 10;



        for(int i = 0; i <= maximumScore; i++ ){

            int randomNumber1 = (int) (Math.random() * 10);
            int randomNumber2 = (int) (Math.random() * 10);

            if(randomNumber1 < randomNumber2){
                int temp = randomNumber1;
                randomNumber1 = randomNumber2;
                randomNumber2 = temp;
            }
            System.out.println(question + randomNumber1 + " - " + randomNumber2);
            int result = randomNumber1 - randomNumber2;
            int userAnswer = sc.nextInt();

            if(result == userAnswer){
                System.out.println(succeed);
                points++;
                System.out.println("Your points so far are: " + points);
            }
            else {
            System.out.println(failedMSg);
            System.out.println("The right answer is: " + result);
            points--;
            System.out.println("Your points so far are: " + points);

            }
                if(points == 0){
                    System.out.println("End of the game");
                    break;
                } if (points == 10) {
                    System.out.println("You won!");
                    break;
                }


    }

}}
