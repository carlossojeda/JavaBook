package Chapter3;

import java.util.Scanner;

public class PointsInATriangleQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a point´s x and y coordinates: ");
        double userX = sc.nextDouble(),
                userY = sc.nextDouble();

        if(userX >= 0 && userY >= 0 && userY <= -0.5 * userX + 100){
            System.out.println("The point is in the triangle");
        } else System.out.println("The point is not in the triangle");
    }
}
