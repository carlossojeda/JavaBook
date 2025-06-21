package Chapter3;

import java.util.Scanner;

public class ComputeTaxes {
    public static void main(String[] args) {

//        Create Scanner
        Scanner sc = new Scanner(System.in);

//        Prompt the user to enter the filing status
        System.out.println("Enter the filing status: \n" + "0 for single filer \n1 for married jointly filer or qualifying widow(er), \n2 for marred separately, \n3 for head of household");

        int userFiler = sc.nextInt();

//        Prompt user to enter taxable income
        System.out.println("Enter the taxable income: ");
        double userIncome = sc.nextDouble();

        double tax = 0;

        //logic of the program

        if(userFiler == 0){ // Compute tax for single filers
            if(userIncome <= 8350){
                tax = userIncome * .10;
            } else if (userIncome <= 33950) {
                tax = 8350 * .10 + (userIncome - 8350) * .15;
            } else if (userIncome <= 82250) {
                tax = 8350 * .10 + (33950 - 8350) * .15 + (userIncome - 33950) * .25;
            } else if (userIncome <= 171550) {
                tax = 8350 * .10 + (33950 - 8350) * .15 + (82250 - 33950) * .25 + (userIncome - 82250) * .28;
            } else if (userIncome <= 372950) {
                tax = 8350 * .10 + (33950 - 8350) * .15 + (82250 - 33950) * .25 + (171550 - 82250 ) * .28 + (userIncome - 171550) * .33;
            } else
                tax = 8350 * .10 + (33950 - 8350) * .15 + (82250 - 33950) * .25 + (171550 - 82250 ) * .28 + (372950 - 171550) * .33 + (userIncome - 372950) * .35;
        }
        System.out.println(tax);
    }
}
