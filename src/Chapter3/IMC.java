package Chapter3;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
//        Creamos el scanner
        Scanner sc = new Scanner(System.in);

//        Pedimos al usuario unos datos
        System.out.println("Ingrese el peso en Kilogramos");
        double kilograms = sc.nextDouble();

        System.out.println("Ingrese la estatura en metros");
        double metros = sc.nextDouble();

        double imc = kilograms / Math.pow(metros, 2);
        System.out.println("Tu indice de masa corporal es: " + imc);

        if(imc < 18.5){
            System.out.println("Bajo de peso");
        } else if (imc < 25) {
            System.out.println("Normal");
        } else if( imc < 30){
            System.out.println("Pasado de peso");
        } else {
            System.out.println("Obeso");
        }

    }
}
