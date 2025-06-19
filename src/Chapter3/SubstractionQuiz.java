package Chapter3;

import java.util.Scanner;

public class SubstractionQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String question = "What is the result?: ";
        String succeed = "Congratulations, you're right";
        String failedMSg = "Keep going!";

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
        } else {
            System.out.println(failedMSg);
            System.out.println("The right answer is: " + result);
        }

    }

}
