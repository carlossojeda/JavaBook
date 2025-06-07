package Chapter3;

import java.util.Scanner;

public class FindTheErrorIf {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("What is the score?");
        int score = sc.nextInt();



//        The error is the if statements stops at the beginning if our score is 60 or more, so, the code is going to print always "D", unless we scored something below 60
        if(score >= 60){
            System.out.println("D");
        } else if (score >= 70) {
            System.out.println("C");
        } else if(score >= 80){
            System.out.println("B");
        } else if (score >= 90){
            System.out.println("A");
        } else {
            System.out.println("F");
        }

    }
}
