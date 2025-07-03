package Chapter3;

import java.util.Scanner;

public class StoredValueBoolean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero Entero cualquiera");
        int userInput = sc.nextInt();

        System.out.println(userInput >= 1 && userInput <= 100);

        System.out.println(userInput >= 1 && userInput <= 100 || userInput < 0);


        int x = 10;
        System.out.println((x - 5) < 4.5);

        System.out.println((x - 5 ) > 4.5);
        System.out.println((x - 5));

        System.out.println(userInput % 2 == 0 && userInput % 3 == 0);
        System.out.println(userInput % 6 == 0);

        System.out.println(45 >= 50 && 45 <= 100);
        System.out.println(67 >= 50 && 67 <= 100);
        System.out.println(101 >= 50 && 101 <= 100);




    }
}
