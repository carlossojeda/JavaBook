package Chapter3;

import java.util.Scanner;

public class AreUElegibleForALoan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your age");
         int age = sc.nextInt();


        System.out.println("How much money do you earn monthly?");
        int earns = sc.nextInt();

        System.out.println("Do you have active debts? type 1 if yes, 0 if not");
        int debts = sc.nextInt();

        if(age < 18 || earns < 8000 || debts == 1){
            System.out.println("You are not elegible for a loan");
        } else{
            System.out.println("Congratulations, you are elegible for a loan!");
        }



    }
}
