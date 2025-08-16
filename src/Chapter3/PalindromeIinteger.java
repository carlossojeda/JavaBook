package Chapter3;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromeIinteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter a three digit integer");
//        String number = sc.nextLine();
//        String numberSPlit = Arrays.toString(number.split(" "));
//        System.out.println(numberSPlit);
//
//        if (numberSPlit.charAt(3) == numberSPlit.charAt(1)) {
//            System.out.println(number + " is a palindrome");
//        } if(numberSPlit.charAt(1) == '-'){
//            if((numberSPlit.charAt(4) == numberSPlit.charAt(2))){
//                System.out.println(number + " is a palindrome");
//            } else System.out.println(number + " is not a palindrome");
//        }
//        else{
//            System.out.println(number + " is not a palindrome");
//        }
//


//        this is a best way to solve this

        System.out.println("Enter a three digit integer");
        int number = sc.nextInt();

        number = Math.abs(number);

        int firsDigit = number / 100;
        int lastDigit = number % 10;

        if(firsDigit == lastDigit){
            System.out.println(number + " is a palindrome");
        } else System.out.println(number + " is not a palindrome");

    }
}
