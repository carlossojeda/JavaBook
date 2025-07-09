package Chapter3;

import java.util.Scanner;

public class HeightOrWeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your weight and height");
        double weight = sc.nextDouble();
        double height = sc.nextDouble();

//        Esta es una version simplificada de un if en el que unicamente devuelve valores booleanos

        System.out.println(weight > 50 || height > 60);

        System.out.println(weight > 50 && height > 60);

//        Esta es la manera normal y mas comun de hacer un if statement

        if(weight > 50 ^ height > 60){
            System.out.println(true);
        } else System.out.println(false);


//        Es el mismo ejemplo, solo simplificado
        System.out.println( weight > 50 ^ height > 60);
    }

}
