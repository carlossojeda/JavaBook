package Chapter3;

import java.util.Scanner;

public class ScissorsRockPaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number (0 scissors, 1 rock or 2 paper): ");

        int userNumber = sc.nextInt();

        int randomNumberPc = (int) (Math.random() * 3);
        System.out.println(randomNumberPc);


        if(userNumber == 0 && randomNumberPc == 0){
            System.out.println("Draw, both have selected scissors");
        }
        else if (userNumber == 0 && randomNumberPc == 1) {
            System.out.println("You have lost, scissors are defeated by  rock");
        } else if (userNumber == 0 && randomNumberPc == 2){
            System.out.println("You have won! Scissors defeats paper");
        }
        if( userNumber == 1 && randomNumberPc == 0){
            System.out.println("You have won, rock defeats scissors!");
        } else if (userNumber == 1 && randomNumberPc == 1) {
            System.out.println("Draw, both have selected rock!");
        } else if (userNumber == 1 && randomNumberPc == 2){
            System.out.println("You have lost! Rocks is defeated by paper");
        }
        if(userNumber == 2 && randomNumberPc == 0){
            System.out.println("You have lost!, paper gets defeated by Scissors");
        } else if (userNumber == 2 && randomNumberPc == 1) {
            System.out.println("You have won!, paper defeats rock");
        } else if( userNumber == 2 && randomNumberPc == 2){
            System.out.println("Draw!, Both have selected paper");
        }
    }

}
