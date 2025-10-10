package Chapter4;

import java.util.Scanner;

public class ComputeAngles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three points: ");
        double x1 = sc.nextDouble(),
                y1 = sc.nextDouble(),
                x2 = sc.nextDouble(),
                y2 = sc.nextDouble(),
                x3 = sc.nextDouble(),
                y3 = sc.nextDouble();

        double a = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 -y3));
        double c = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

        double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
        double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
        double C = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));

        System.out.println("THe three angles are: " + Math.round(A * 100) / 100.0 + " " + Math.round(B * 100) / (100.0) + " " + Math.round(C * 100 / 100.0));

    }
}
