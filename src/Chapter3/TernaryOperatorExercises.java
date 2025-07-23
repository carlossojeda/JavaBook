package Chapter3;

import java.util.Scanner;

public class TernaryOperatorExercises {
    public static void main(String[] args) {
//        Este ejercicio se encarga de decirme si los numeros estan ordenados o desordenados
        Scanner sc = new Scanner(System.in);
        System.out.println("Enters 3 numbers from 0 - 9");

        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();

        System.out.println((x < y && y < z) ? "sorted" : "not sorted");

        //Second exercise
        //Este ejercicio evalua la edad del usuario y segun su edad se modifica el precio de su entrada
        System.out.println("Enter your age");
        int ages = sc.nextInt();
        int ticketPrice;

        ticketPrice = ages >= 16 ? 20 : 10;
        System.out.println(ticketPrice);
    }
}
