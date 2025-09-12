package Chapter3;

import java.util.Scanner;

public class PointInARectangleQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a point (x, y)");
        double x = sc.nextDouble(),
                y = sc.nextDouble();

        String point = "(" + x + "," + y + ")";



        if(Math.abs(x) <= 10.0 / 2 && Math.abs(y) <= 5.0 / 2){
            System.out.println("Point " + point + " is in the rectangle");
        } else{
            System.out.println("Point " + point + " is not in the rectangle");
        }
    }
}
