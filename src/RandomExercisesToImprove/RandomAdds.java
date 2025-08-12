package RandomExercisesToImprove;

import java.util.Scanner;

public class RandomAdds {
    public static void main(String[] args) {


        /*Este porgrama simula una neurona aunque obviamente el funcionamienot no es para nada similar, solo busco mejorar la maner ane que escribo codigo */

        Scanner sc = new Scanner(System.in);


        System.out.println("How many operations do you want the machine solve?");
        int numeroOperaciones = sc.nextInt();

        for(int i = 0; i < numeroOperaciones; i++){
            int randomNum1 = (int) (Math.random() * 100);
            int randomNum2 = (int) (Math.random() * 100);
            int result = randomNum1 + randomNum2;

            System.out.println(randomNum1 + " " + " + " + randomNum2);
            int machineResult = (int) (Math.random() * 199);


            if(machineResult == result){
                System.out.println("Right answer!");
            } else {
                System.out.println("Wrong answer!");
                System.out.println("Machine answer: " + machineResult);
                System.out.println("Right answer: " + result);
                System.out.println("---------------");
            }

        }

    }
}
