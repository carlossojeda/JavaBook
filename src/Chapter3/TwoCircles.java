package Chapter3;

import java.util.Scanner;

public class TwoCircles {
    public static void main(String[] args) {

        //Prompt
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter circle 1 center x, y coordinates and radius: ");
        double x1 = sc.nextDouble(),
                y1 = sc.nextDouble(),
                radius1 = sc.nextDouble();


        System.out.println("Enter circle 2 center x, y coordinates and radius: ");
        double x2 = sc.nextDouble(),
                y2 = sc.nextDouble(),
                radius2 = sc.nextDouble();

        double square1 = (Math.pow(x2 - x1, 2));
        double square2 = (Math.pow(y2 - y1, 2));

        double distanceBetween = Math.sqrt(square1 + square2);
        double radiusSubs = radius1 - radius2;
        double radiusSum = radius1 + radius2;

        if(distanceBetween <= radiusSubs ){
            System.out.println("Circle 2 is inside circle 1");
        } else if (distanceBetween <= radiusSum) {
            System.out.println("Circle 2 overlaps circle 1");
        } else {
            System.out.println("Circle 2 does not overlap circle 1");
        }
    }
}
