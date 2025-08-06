package Chapter3;

import java.util.Scanner;

public class SortThreeIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enters three integers");

        int     a = sc.nextInt(),
                b = sc.nextInt(),
                c = sc.nextInt();

            if(a < b && b < c) {
                System.out.println(a + " " + b + " " + c + " Ejercicio 1");
            }
            if(b < a && a < c){
                System.out.println(b + " " + a + " " + c + " Ejercicio 2");
            }
            if(b < c && a > c){
                System.out.println(b + " " + c + " " + a + " Ejercicio 3");
            }
            if(c < a && a < b){
                System.out.println(c + " " + a + " " + b + " Ejercicio 4");
            }
            if(c < b && b < a){
                System.out.println(c + " " + b + " " + a + " Ejercicio 5");
            }
            if(c > a &&  b > c){
                System.out.println(a + " " + c + " " + b + " Ejericio 6");
            }
    }
}
