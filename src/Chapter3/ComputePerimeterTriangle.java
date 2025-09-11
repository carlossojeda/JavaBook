package Chapter3;


import java.util.Scanner;

public class ComputePerimeterTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size in cm of three edges of a triangle");
        double sideA = sc.nextDouble(),
                sideB = sc.nextDouble(),
                sideC = sc.nextDouble();



        if(sideA + sideB > sideC &&
            sideB + sideC > sideA &&
            sideC + sideA > sideB){

            double perimeter = sideA + sideB + sideC;
            System.out.println("The perimeter of this triangle is: " + perimeter);
        } else{
            System.out.println("The input is invalid: those sides cannot form a triangle");
        }



    }
}
