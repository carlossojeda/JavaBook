package Chapter3;

import javax.swing.*;
import java.util.Scanner;

public class PointInACircleQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of the point (x and y): ");

        double x = sc.nextDouble(),
                y = sc.nextDouble();

        double formulaResult  = Math.sqrt((Math.pow(0 - x, 2) + Math.pow(0 - y, 2)));

        System.out.println(formulaResult);

        if(formulaResult < 10){
            JOptionPane.showMessageDialog(null, "Point ("+x + ", " + y+ ") is in the circle" );
        } else {
            JOptionPane.showMessageDialog(null, "Point ("+x + ", " + y+ ") is not the circle" );
        }
    }
}
