package Chapter3;

import java.util.Scanner;

public class CheckISBN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enters 9 digits");
        int     d1 = sc.nextInt(),
                d2 = sc.nextInt(),
                d3 = sc.nextInt(),
                d4 = sc.nextInt(),
                d5 = sc.nextInt(),
                d6 = sc.nextInt(),
                d7 = sc.nextInt(),
                d8 = sc.nextInt(),
                d9 = sc.nextInt();

        int checksum = ((d1) + (d2 * 2) + (d3 * 3) + (d4 * 4) + (d5 * 5) + (d6 * 6) + (d7 * 7) + (d8 * 8) + (d9 * 9))%11;



        if(checksum == 10){
            System.out.println(d1 + " " + d2 + " " + d3 + " " + d4 + " " + d5 + " " + d6 + " " + d7 + " " + d8 + " " + d9 + " " + "X");

        } else {
            System.out.println(d1 + " " + d2 + " " + d3 + " " + d4 + " " + d5 + " " + d6 + " " + d7 + " " + d8 + " " + d9 + " " + checksum);
        }

    }
}
