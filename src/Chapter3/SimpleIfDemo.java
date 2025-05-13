package Chapter3;

import java.util.Scanner;

public class SimpleIfDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an Integer: ");
        int number = sc.nextInt();
        double pay = 100;

        if(number > 90){
            pay += pay * .03;
        }
        System.out.println("pay = " + pay);







//        int x = 0;
//
//        if(number > 0 ){
//            x = 1;
//        }
//        System.out.println("x = " + x);;



//
//
//        if(number % 5 == 0){
//            System.out.println("HiFive");
//        }
//        if(number % 2 == 0){
//            System.out.println("HiEven");
//        }
    }
}
