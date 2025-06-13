package ChatGPTChallenges.BattleSimulatorRPG;

import java.util.Arrays;
import java.util.Scanner;

public class RPGBattle {


    public static void main(String[] args) {

        //Creación de personajes disponibles
        RPGCharacter wizard = new RPGCharacter("Wizard", 100, 25, 75, 30);
        RPGCharacter warrior =   new RPGCharacter("Warrior", 100, 30, 30, 20);
        RPGCharacter assassin = new RPGCharacter("Assassin", 100, 20, 50, 70);


        //Selección de personaje
        Scanner sc = new Scanner(System.in);
        System.out.println("Escoge un personaje: " +
                        "\n 1.- wizard " + "Salud: " + wizard.health + " "+  "Poder de ataque: " + wizard.powerAttack + " " + "Defensa: " + wizard.defense + " " + "Velocidad: " + wizard.speed + " " +
                        "\n 2.- warrior " + "Salud: " + warrior.health + " "+  "Poder de ataque: " + warrior.powerAttack + " " + "Defensa: " + warrior.defense + " " + "Velocidad: " + warrior.speed + " " +
                    "   \n 3.- assassin " + "Salud: " + assassin.health + " "+  "Poder de ataque: " + assassin.powerAttack + " " + "Defensa: " + assassin.defense + " " + "Velocidad: " + assassin.speed + " ");

        int seleccion = sc.nextInt();
        if(seleccion == 1){
            String jugador = wizard.toString();
            System.out.println(jugador);
        }

    }


    public static String winnerOfTheBattle(RPGCharacter character1, RPGCharacter character2){
        return "hi";
    }



}
