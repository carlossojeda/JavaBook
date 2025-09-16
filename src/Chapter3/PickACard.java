package Chapter3;

import java.util.Scanner;

public class PickACard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pick a card between 1 and 52");
        int userNumber = sc.nextInt() - 1;

        int choosingTheCategory = userNumber / 13;
        int choosingTheNumber = userNumber % 13;

        String categoryCard = "";
        if(choosingTheCategory == 0){
            categoryCard = "Clubs";
        } else if (choosingTheCategory == 1) {
            categoryCard = "Diamonds";
        } else if (choosingTheCategory == 2){
            categoryCard = "Hearts";
        } else if (choosingTheCategory == 3){
            categoryCard = "Spades";
        }

        String cardName = "";
        int cardNumber;

        if(choosingTheNumber == 0){
            cardName = "Ace";
        } else if (choosingTheNumber == 1) {
            cardName = "2";
        } else if (choosingTheNumber == 2) {
            cardName = "3";
        } else if (choosingTheNumber == 3) {
            cardName = "4";
        } else if (choosingTheNumber == 4) {
            cardName = "5";
        } else if (choosingTheNumber == 5) {
            cardName = "6";
        } else if (choosingTheNumber == 6) {
            cardName = "7";
        } else if (choosingTheNumber == 7) {
            cardName = "8";
        } else if (choosingTheNumber == 8) {
            cardName = "9";
        } else if (choosingTheNumber == 9) {
            cardName = "10";
        } else if (choosingTheNumber == 10) {
            cardName = "Jack";
        } else if (choosingTheNumber == 11) {
            cardName = "Queen";
        } else if (choosingTheNumber == 12) {
            cardName = "King";
        }


        System.out.println("cardName = " + cardName);
        System.out.println(choosingTheNumber);
        System.out.println("choosingTheCategory = " + choosingTheCategory);


        System.out.println("The car you picked is " + cardName + " of " + categoryCard);


    }
}
