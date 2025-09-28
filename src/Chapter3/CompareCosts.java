package Chapter3;

import java.util.Scanner;

public class CompareCosts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the weight and price for package 1: ");
        double weight1 = sc.nextDouble(),
                price1 = sc.nextDouble();

        System.out.println("Enter the weight and price for package 2: ");
        double weight2 = sc.nextDouble(),
                price2 = sc.nextDouble();



        double betterPrice = price1 - price2;
        double betterWeight = weight1 - weight2;


        if(betterPrice > price2 && betterWeight > weight2){
            System.out.println("Package 1 has better price");
        } else if (betterPrice == price2 && betterWeight == weight2) {
            System.out.println("Both packages has same price");
        } else {
            System.out.println("Package 2 has better price");
        }


    }
}
