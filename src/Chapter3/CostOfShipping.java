package Chapter3;

import javax.swing.*;
import java.util.Scanner;

public class CostOfShipping {
    public static void main(String[] args) {


        String userWeight = JOptionPane.showInputDialog("Enter the weight of your package: ");
        double packageWeight = Double.parseDouble(userWeight);
        System.out.println(packageWeight);

        if(packageWeight < 0){
            JOptionPane.showMessageDialog(null, "Invalid Input");
        } else if (packageWeight <= 1 ) {
            JOptionPane.showMessageDialog(null, "You must pay 3.5 usd");
        } else if (packageWeight <= 3) {
            JOptionPane.showMessageDialog(null, "You must pay 5.5 usd");
        } else if( packageWeight <= 10){
            JOptionPane.showMessageDialog(null, "You must pay 8.5 usd");
        } else if( packageWeight <= 20){
            JOptionPane.showMessageDialog(null, "You must pay 10.5 usd");
        } else{
            JOptionPane.showMessageDialog(null, "The package cannot be shipped");
        }
    }
}
