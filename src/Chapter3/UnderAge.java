package Chapter3;

import java.util.Scanner;

public class UnderAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = sc.nextInt();

        if(age < 18){
            System.out.println("You can't drink alcohol");
        } else {
            System.out.println("You can buy alcohol, cheers!");
        }
    }
}
