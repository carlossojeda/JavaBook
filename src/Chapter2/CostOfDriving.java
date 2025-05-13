package Chapter2;

import java.util.Scanner;

public class CostOfDriving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the driving distance: ");
        double drivingDistance = sc.nextDouble();

        System.out.println("Enter miles per gallon: ");
        double milesPerGallon = sc.nextDouble();

        System.out.println("Enter price per gallon: ");
        double pricePerGallon = sc.nextDouble();

        double costPerGallon = pricePerGallon / milesPerGallon;

        double total = costPerGallon * drivingDistance;

        System.out.println("The cost of driving is " + total);


    }
}
