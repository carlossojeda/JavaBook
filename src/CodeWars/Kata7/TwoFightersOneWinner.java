package CodeWars.Kata7;

public class TwoFightersOneWinner {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker){
        new Fighter(fighter1.toString(), fighter1.health, fighter1.damagePerAttack);
        new Fighter(fighter2.toString(), fighter2.health, fighter2.damagePerAttack);

        if(firstAttacker.contentEquals(fighter1.name)){
            while (fighter1.health > 0 && fighter2.health > 0){
                fighter2.health  = fighter2.health - fighter1.damagePerAttack;
                System.out.println(STR."\{fighter1.name} Attacks \{fighter2.name} \{fighter2.name} now has \{fighter2.health} health");

                if(fighter2.health <= 0){
                    break;
                }

                fighter1.health = fighter1.health - fighter2.damagePerAttack;
                System.out.println(fighter2.name + " Attacks " + fighter1.name + " " + fighter1.name + " now has " + fighter1.health + " health");

                if(fighter1.health <= 0){
                    break;

                }


            }
        }
        else {
            while (fighter1.health > 0 && fighter2.health > 0){

                fighter1.health = fighter1.health - fighter2.damagePerAttack;
                System.out.println(fighter2.name + " Attacks " + fighter1.name + " " + fighter1.name + " now has " + fighter1.health + " health");

                if(fighter1.health <= 0){
                    break;

                }


                fighter2.health  = fighter2.health - fighter1.damagePerAttack;
                System.out.println(fighter1.name + " Attacks " + fighter2.name + " " + fighter2.name + " now has " + fighter2.health + " health");

                if(fighter2.health <= 0){
                    break;
                }



            }
        }






//
//        for (; fighter2.health >= 0; fighter1.damagePerAttack++){
//            fighter2.health--;
//            System.out.println(fighter1.name + " Attacks " + fighter2.name + " " + fighter2.name + " now has " + fighter2.health + " health");
//
////
//            for(; fighter1.health >= 0; fighter2.damagePerAttack++){
//                fighter1.health--;
//                System.out.println(fighter2.name + " Attacks " + fighter1.name + " " + fighter1.name + " now has " + fighter1.health + " health");
//
//            }
//        }

        if (fighter1.health <= 0) {
            return fighter2.name + " attacks" + fighter1.name + " now has " + fighter1.health + " health and is dead. "  + fighter2.name + " wins.";

        } else {
            return fighter1.name + " attacks " + fighter2.name + " now has " + fighter2.health + " health and is dead. "  + fighter1.name + " wins.";
        }
    }

    public static void main(String[] args) {
        System.out.println(TwoFightersOneWinner.declareWinner(new Fighter("Lew", 10, 2), new Fighter("Harry", 5, 4), "Harry"));
    }
}
