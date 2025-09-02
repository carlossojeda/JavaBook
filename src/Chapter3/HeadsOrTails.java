package Chapter3;

import javax.swing.*;
import java.util.Scanner;

public class HeadsOrTails {
    public static void main(String[] args) {

        int randomness = (int) (Math.random() * 2);


        String head = "Head";
        String tail = "Tail";
        String rightAnswerHead = "Youre right, the coin flip " + head;
        String rightAnswerTail = "Youre right, the coin flip " + tail;
        String wrongAnswerHead = "Wrong answer! the coin flipped " + head;
        String wrongAnswerTail = "Wrong answer! the coin flipped " + tail;


        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the coin flip Head or tail ( 0 or 1)");
        int userAnswer = sc.nextInt();

        if(randomness == userAnswer){
            if(randomness == 0){
                JOptionPane.showMessageDialog(null, rightAnswerHead);
            }
            if(randomness == 1){
                JOptionPane.showMessageDialog(null, rightAnswerTail);
            }
        } else{
            if(randomness == 0){
                JOptionPane.showMessageDialog(null, wrongAnswerHead);
            }
            if(randomness == 1){
                JOptionPane.showMessageDialog(null, wrongAnswerTail);
            }
        }

    }
}
