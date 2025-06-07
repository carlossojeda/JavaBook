package Chapter3;

import java.util.Scanner;

public class ifIncreasing {
    public static void main(String[] args) {

//        Users enters his information
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your score?");
        int score = sc.nextInt();

//      if statement works
        int pay = 0;
        if(score > 90){
            pay += 3;
        } else{
            pay += 1;
        }

        System.out.println(pay);
    }
}
