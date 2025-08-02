package Chapter3;

import java.util.Scanner;

public class LinealAlgrebraEquations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the values of a, b, c, d, e and f");
        double  a = sc.nextDouble(),
                b = sc.nextDouble(),
                c = sc.nextDouble(),
                d = sc.nextDouble(),
                e = sc.nextDouble(),
                f = sc.nextDouble();




        if((a * d) - (b * c) == 0){
            System.out.println("The equation has no solutions");
        } else {
            double x = ((e * d) - (b * f)) / ((a * d) - (b * c));

            double y = ((a * f) - (e * c)) / ((a * d) - (b * c));

            System.out.println("x is " + x + " and y is: " + y);
        }
    }
}
