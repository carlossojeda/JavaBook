package Chapter3;

import java.util.Scanner;

public class PointPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three points for p0, p1, and p2, each point requires 2 values");
        double x0 = sc.nextDouble(),
                y0 = sc.nextDouble(),
                x1 = sc.nextDouble(),
                y1 = sc.nextDouble(),
                x2 = sc.nextDouble(),
                y2 = sc.nextDouble();

        double operation = ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0));

        if(operation > 0){
            System.out.println("p2 is on the left side of the line");
        } else if (operation == 0) {
            System.out.println("p2 is on the same line");
        } else if (operation < 0) {
            System.out.println("p2 is on the right side of the line");
        }
    }
}
