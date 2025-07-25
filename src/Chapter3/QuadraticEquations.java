package Chapter3;

import java.util.Scanner;

public class QuadraticEquations {
    public static void main(String[] args) {

        //Este programa evaluara si una ecuacion tiene dos raices cuadradas, una o niguna y en dado caso que tenga al menos 1 la reslovera y devolvera el resultado

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a, b, c");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();

        double discriminant = Math.pow(b, 2) - 4 * a * c;
        if(discriminant > 0){

            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

                    System.out.println("The equations has two roots: " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("The equation has one root: " + root);
        } else System.out.println("The equiation has no real roots");
    }
}
