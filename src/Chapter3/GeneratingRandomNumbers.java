package Chapter3;

import java.util.Scanner;

public class GeneratingRandomNumbers {
    public static void main(String[] args) {
        //Creamos los valores
        Scanner sc = new Scanner(System.in);
        String congratulatons = "Great job!";
        String error = "You almost have it, keep trying!";
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        //Imprimimos para conocer los valores
        System.out.println(number1);
        System.out.println(number2);

        //Logica de if si el numero 2 es mayor al numero 1
        if(number1 < number2){
            System.out.println("What is the result of: " + number2 + " -" + " "+ number1 );
            int result = sc.nextInt();
            int resta = number2 - number1;

            if(result == resta){
            System.out.println("resta = " + resta);
                System.out.println(congratulatons);
            } else {
                System.out.println(error);
                System.out.println("The correct answer was " + resta);
            }

        }
        //logica if si el numero 1 es mayor al numero 2
        else{
            int resta = number1 - number2;
            System.out.println("What is the result of: " + number1 + " -" + " "+ number2 );
            int result = sc.nextInt();
            if(result == resta){
                System.out.println("resta = " + resta);
                System.out.println(congratulatons);
            }
            else {
                System.out.println(error);
                System.out.println("The correct answer was " + resta);
            }
        }
    }
}
