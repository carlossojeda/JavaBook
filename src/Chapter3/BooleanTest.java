package Chapter3;

import java.util.Scanner;

public class BooleanTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un valor para x, y, z");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double z = input.nextDouble();

        System.out.println("(x < y && y < z) is: " + (x < y && y < z));
        System.out.println("(x < y || y < z) is: " + (x < y || y < z));
        System.out.println("!(x < y) is: " + !(x < y));
        System.out.println("(x + y < z) is: " + (x + y < z));
        System.out.println("(x + y > z) is: " + (x + y > z));


        System.out.println("Enter your age: ");
        int age = input.nextInt();

        if(age > 13 && age < 18 ){
            System.out.println(true);
        } else System.out.println(false);


    }
}
