package Chapter3;

import java.util.Scanner;

public class IntersectingPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter x1, y1, x2, y2, x3, y3, x4, y4: ");

        double x1 = sc.nextDouble(),
                y1 = sc.nextDouble(),
                x2 = sc.nextDouble(),
                y2 = sc.nextDouble(),
                x3 = sc.nextDouble(),
                y3 = sc.nextDouble(),
                x4 = sc.nextDouble(),
                y4 = sc.nextDouble();

        double a = (y1 - y2);
        double b = (x2 - x1);
        double e = (a * x1 + b * y1);
        double c = (y3 - y4);
        double d = (x4 - x3);
        double f = (c * x3 + d * y3);

        double denominator = (a * d) - (b * c);

        if( denominator == 0){
            System.out.println("Parallel");
        } else {
            double x = (((e * d) - (b * f)) / denominator);
            double y = (((a * f) - (e * c)) / denominator);
            System.out.println(x);
            System.out.println(y);

            System.out.println("The intersecting point is at (" + x + ", " + y + ")");

        }


    }
}
