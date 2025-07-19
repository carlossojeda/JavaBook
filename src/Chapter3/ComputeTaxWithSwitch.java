package Chapter3;

import java.util.Scanner;

public class ComputeTaxWithSwitch {

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
                switch (userFiler){
                    case 0:
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
                    break;
                    case 1:
                        if(userIncome <= 16700){
                            tax = userIncome * .10;
                        } else if (userIncome <= 67900){
                            tax = 16700 * .10 + (userIncome - 16700) * .15;
                        } else if(userIncome <= 137050){
                            tax = 16700 * .10 + (67900 - 16700) * .15 + (userIncome - 67900) * .25;
                        } else if(userIncome <= 208850){
                            tax = 16700 * .10 + (67900 - 16700) * .15 + (137050 - 67900) * .25 + (userIncome - 137050) * .28;
                        } else if (userIncome <= 372950){
                            tax = 16700 * .10 + (67900 - 16700) * .15 + (137050 - 67900) * .25 + (208850 - 137050) * .28 + (userIncome - 208850) * .33;
                        } else {
                            tax = 16700 * .10 + (67900 - 16700) * .15 + (137050 - 67900) * .25 + (208850 - 137050) * .28 + (372950 - 208850) * .33 + (userIncome - 372950) * .35;
                        }
                        break;
                    case 2:
                        if(userIncome <= 11950){
                            tax = userIncome * .10;
                        } else if (userIncome <= 45500){
                            tax = 11950 * .10 + (userIncome - 11950) * .15;
                        } else if (userIncome <= 117450){
                            tax = 11950 * .10 + (45500 - 11950) * .15 + (userIncome - 45500) * .25;
                        } else if (userIncome <= 190200){
                            tax = 11950 * .10 + (45500 - 11950) * .15 + (117450 - 45500) * .25 + (userIncome - 117450) * .28;
                        } else if(userIncome <= 372950){
                            tax = 11950 * .10 + (45500 - 11950) * .15 + (117450 - 45500) * .25 + (190200 - 117450) * .28 + (userIncome - 190200) * .33;
                        } else {
                            tax = 11950 * .10 + (45500 - 11950) * .15 + (117450 - 45500) * .25 + (190200 - 117450) * .28 + (372950 - 190200) * .33 + (userIncome - 372950) * .35;
                        } break;
                    default:  System.out.println("Error: invalid status");
                        System.exit(1);

                }



                System.out.println("Tax is " + (int) (tax * 100 / 100));
            }

        }
