package Chapter3;

import java.util.Scanner;

public class TestBooleanOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Receive an input
        System.out.println("Enter an Integer: ");
        int userInput = sc.nextInt();

        if(userInput % 2 == 0 && userInput % 3 == 0){
            System.out.println(userInput + " is divisible by 2 and 3");
        }
        if(userInput % 2 == 0 || userInput % 3 == 0){
            System.out.println(userInput + " is divisible by 2 or 3 ");
        }
        if(userInput % 2 == 0 ^ userInput % 3 == 0){
            System.out.println(userInput + " is divisible by 2 or 3 but not both");
        }
    }
}
